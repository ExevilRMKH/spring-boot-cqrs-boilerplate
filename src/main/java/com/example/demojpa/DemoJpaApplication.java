package com.example.demojpa;

import io.r2dbc.spi.ConnectionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.web.reactive.config.EnableWebFlux;

@EnableWebFlux
@SpringBootApplication
public class DemoJpaApplication {
    @Bean
    ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory){
        var initializer = new ConnectionFactoryInitializer();
        initializer.setConnectionFactory(connectionFactory);
        return initializer;
    }
    public static void main(String[] args) {
        SpringApplication.run(DemoJpaApplication.class, args);
    }
}
