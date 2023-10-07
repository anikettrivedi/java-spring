package org.example;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringSecureWebApp {
    public static void main(String[] args) {
        log.info("starting spring boot secure application...");
        SpringApplication.run(SpringSecureWebApp.class);
    }
}