package com.example.demojpa.app.configuration;

import com.example.demojpa.app.properties.ControlPlaneProperties;
import com.example.demojpa.generator.domain.channel.ChannelType;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;

@Configuration
@EnableConfigurationProperties
public class AppConfig {
    @Bean
    public ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory){
        var initializer = new ConnectionFactoryInitializer();
        initializer.setConnectionFactory(connectionFactory);
        return initializer;
    }

    @ConfigurationProperties("control-plane")
    @Bean
    public ControlPlaneProperties channelTypes(){
        return new ControlPlaneProperties();
    }
}
