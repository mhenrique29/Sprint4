package br.com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.security.*;
import br.com.demo.Entity.User;
import br.com.demo.repository.UserRepository;
import br.com.service.EmailService;

import java.security.SecureRandom;

@RestController
@RequestMapping("/api/users")
public class UserController<passwordEncoder> {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Autowired
    private JwtUtil jwtUtil;

    @Autowired
    private EmailService emailService;

    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@RequestBody User user) {
        if (userRepository.findByUsername(user.getUsername()) != null) {
            return ResponseEntity.badRequest().body("Username already exists");
        }
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        userRepository.save(user);
        return ResponseEntity.ok("User registered successfully");
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User user) {
        User existingUser = userRepository.findByUsername(user.getUsername());
        if (existingUser == null || !passwordEncoder.matches(user.getPassword(), existingUser.getPassword())) {
            return ResponseEntity.badRequest().body("Invalid username or password");
        }
        String token = jwtUtil.generateToken(existingUser.getUsername());
        return ResponseEntity.ok("Login successful. Token: " + token);
    }

    @PostMapping("/forgot-password")
    public ResponseEntity<?> forgotPassword(@RequestParam String username) {
        User user = userRepository.findByUsername(username);
        if (user == null) {
            return ResponseEntity.badRequest().body("User not found");
        }
        String newPassword = generateRandomPassword();
        user.setPassword(passwordEncoder.encode(newPassword));
        userRepository.save(user);
        sendPasswordResetEmail(user.getUsername(), newPassword);
        return ResponseEntity.ok("Password reset successful. Check your email for the new password.");
    }

    private String generateRandomPassword() {
        int length = 10;
        String characterSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+";
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            int randomIndex = random.nextInt(characterSet.length());
            password.append(characterSet.charAt(randomIndex));
        }
        return password.toString();
    }

    private void sendPasswordResetEmail(String username, String newPassword) {
        String to = username;
        String subject = "Password Reset";
        String text = "Your new password is: " + newPassword;
        emailService.sendEmail(to, subject, text);
    }
}
