package com.example.demojpa.app;

import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;

@Configuration
public class AppConfig {
    @Bean
    ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory){
        var initializer = new ConnectionFactoryInitializer();
        initializer.setConnectionFactory(connectionFactory);
        return initializer;
    }
}
