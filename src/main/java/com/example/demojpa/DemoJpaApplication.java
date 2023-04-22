package com.example.demojpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux()
@SpringBootApplication
public class DemoJpaApplication {
    public static void main(String[] args) {
        SpringApplication.run(DemoJpaApplication.class, args);
    }
}
