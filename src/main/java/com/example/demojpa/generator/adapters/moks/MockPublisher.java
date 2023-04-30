package com.example.demojpa.generator.adapters.moks;

import com.example.demojpa.control_plane.domaine.Publisher;
import com.example.demojpa.generator.domain.message.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Slf4j
@Component
@Profile("mock")
public class MockPublisher implements Publisher {
    @Bean
    private Publisher publisher(){
        return this;
    }
    public Mono<Void> push(Message message) {
        log.info("push message: {}",message);
        return Mono.empty();
    }
}
