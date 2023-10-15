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
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

/*
 * simple in-memory authorization using thymeleaf UI & Spring Security
 * usernames & password are hardcoded without encryption (unsafe)
 * */

@AllArgsConstructor
@Configuration
@EnableWebSecurity
@Profile("dev-auth")
public class InMemoryWebSecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.authorizeHttpRequests(
                        authorizationManagerRequestMatcherRegistry -> authorizationManagerRequestMatcherRegistry
                                .requestMatchers("/", "/home")
                                .permitAll()
                                .anyRequest()
                                .authenticated()
                )
                .formLogin(
                        httpSecurityFormLoginConfigurer -> httpSecurityFormLoginConfigurer
                                .loginPage("/login")
                                .permitAll()
                )
                .logout(
                        httpSecurityLogoutConfigurer -> httpSecurityLogoutConfigurer.permitAll()
                )
                .build();
    }

    @Bean
    public UserDetailsService userDetailsService() {
        return new InMemoryUserDetailsManager(
                User.withDefaultPasswordEncoder()
                        .username("username")
                        .password("username")
                        .build()
        );
    }
}
