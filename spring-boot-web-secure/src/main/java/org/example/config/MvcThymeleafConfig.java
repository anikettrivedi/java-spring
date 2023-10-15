package org.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/*
 * Thymeleaf UI configuration
 * */
@Configuration
@Profile({
        "dev-auth",
        "dev-auth-h2",
        "dev-auth-h2-encoded"
})
public class MvcThymeleafConfig implements WebMvcConfigurer {

    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/login").setViewName("login");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/hello").setViewName("hello");
    }

}