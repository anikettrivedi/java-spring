package org.example.config;

import lombok.AllArgsConstructor;
import org.example.repository.UserRolesRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.LogoutConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import java.util.List;
import java.util.stream.Collectors;

/*
 * simple in-memory authorization using thymeleaf UI & Spring Security & Spring JPA (In Memory H2 DB)
 * */

@AllArgsConstructor
@Configuration
@EnableWebSecurity
@Profile("dev-auth-h2")
public class InMemoryWebSecurityConfigUsingH2Db {

    private final UserRolesRepository userRolesRepository;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests((requests) -> requests
                        .requestMatchers("/", "/home")
                        .permitAll()
                        .anyRequest()
                        .authenticated())
                .formLogin((form) -> form
                        .loginPage("/login")
                        .permitAll())
                .logout(LogoutConfigurer::permitAll)
                .build();
    }

    @Bean
    public UserDetailsService userDetailsService() {

        List<UserDetails> userDetailsList = userRolesRepository.findAll()
                .stream()
                .map(userRole -> User.withDefaultPasswordEncoder()
                        .username(userRole.getUsername())
                        .password(userRole.getPassword())
                        .roles(userRole.getRole().toLowerCase().split(","))
                        .build())
                .collect(Collectors.toList());

        return new InMemoryUserDetailsManager(userDetailsList);
    }
}
