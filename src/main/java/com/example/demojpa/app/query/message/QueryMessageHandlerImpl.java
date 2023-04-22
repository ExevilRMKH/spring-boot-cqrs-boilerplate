package com.example.demojpa.app.query.message;

import com.example.demojpa.domain.message.Message;
import com.example.demojpa.domain.message.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
public class QueryMessageHandlerImpl implements QueryMessageHandler {
    private final MessageRepository repository;
    @Override
    public Flux<Message> getMessageListHandler() {
        return repository.findAll();
    }

    @Override
    public Mono<Message> getMessageByIdHandler(Long id) {
        return repository.findById(id);
    }
}
