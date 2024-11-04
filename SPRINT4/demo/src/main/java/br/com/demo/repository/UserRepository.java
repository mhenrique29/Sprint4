package br.com.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.demo.Entity.User;




@RestController
@RequestMapping("/api/users")
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
   
	User findByUsername(String username);
	
	
	 public static final UserRepository userRepository = null;

	    public static final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

	   
	    
	    @PostMapping("/register")
	    public default ResponseEntity<?> registerUser(@RequestBody User user) {
	        if (userRepository.findByUsername(user.getUsername()) != null) {
	            return ResponseEntity.badRequest().body("Username already exists");
	        }
	        user.setPassword(passwordEncoder.encode(user.getPassword()));
	        userRepository.save(user);
	        return ResponseEntity.ok("User registered successfully");
	    }

	   
	    
	    @GetMapping
	    public default Iterable<User> listarTodosUsuarios() {
	        return userRepository.findAll();
	    }

	    
	   
	    
	    @GetMapping("/{id}")
	    public default ResponseEntity<?> buscarUsuarioPorId(@PathVariable Long id) {
	        Optional<User> user = userRepository.findById(id);
	        if (user.isPresent()) {
	            return ResponseEntity.ok(user.get());
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
	        }
	    }

	   
	    
	    @PutMapping("/{id}")
	    public default ResponseEntity<?> atualizarUsuario(@PathVariable Long id, @RequestBody User usuarioAtualizado) {
	        Optional<User> user = userRepository.findById(id);
	        if (user.isPresent()) {
	            User userExistente = user.get();
	            userExistente.setUsername(usuarioAtualizado.getUsername());
	            userExistente.setPassword(passwordEncoder.encode(usuarioAtualizado.getPassword()));
	            userRepository.save(userExistente);
	            return ResponseEntity.ok("User updated successfully");
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
	        }
	    }

	   
	    
	    @DeleteMapping("/{id}")
	    public default ResponseEntity<?> excluirUsuario(@PathVariable Long id) {
	        if (userRepository.existsById(id)) {
	            userRepository.deleteById(id);
	            return ResponseEntity.ok("User deleted successfully");
	        } else {
	            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("User not found");
	        }
	    }


	}
