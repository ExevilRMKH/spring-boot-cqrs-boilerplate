package com.example.demojpa.app.query.message;

import com.example.demojpa.generator.domain.Message;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface QueryMessageHandler {
    Flux<Message> getMessageListHandler();
    Mono<Message> getMessageByIdHandler(Long id);
}
