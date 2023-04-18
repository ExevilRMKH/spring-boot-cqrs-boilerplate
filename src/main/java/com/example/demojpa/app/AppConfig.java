package com.example.demojpa.app;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@EnableConfigurationProperties
public class AppConfig{
    @Bean
    @ConfigurationProperties("react.db")
    public DataSourceProperties properties(){
        return new DataSourceProperties();
    }
}
