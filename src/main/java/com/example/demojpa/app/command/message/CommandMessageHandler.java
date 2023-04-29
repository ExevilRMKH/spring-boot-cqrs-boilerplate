package com.example.demojpa.app.command.message;

import com.example.demojpa.generator.domain.MessageDTO;
import reactor.core.publisher.Mono;

public interface CommandMessageHandler {
    Mono<Long> create(MessageDTO body);
    Mono<Void> update(Long id, MessageDTO body);
}
