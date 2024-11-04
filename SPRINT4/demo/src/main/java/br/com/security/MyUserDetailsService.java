package br.com.security;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // Aqui você pode carregar o usuário do banco de dados ou outro armazenamento
        // Exemplo:
        // User user = userRepository.findByUsername(username);
        
        if (username.equals("admin")) {
            return org.springframework.security.core.userdetails.User.withUsername("admin")
                    .password("{noop}password") // Aqui o {noop} indica que a senha não será encriptada
                    .roles("ADMIN")
                    .build();
        } else {
            throw new UsernameNotFoundException("Usuário não encontrado.");
        }
    }
}
