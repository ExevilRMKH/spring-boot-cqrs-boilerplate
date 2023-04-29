package com.example.demojpa.app.command.message;

import com.example.demojpa.app.ResourceNotFoundException;
import com.example.demojpa.generator.domain.Message;
import com.example.demojpa.generator.domain.MessageDTO;
import com.example.demojpa.generator.domain.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CommandMessageHandlerImpl implements CommandMessageHandler {
    private final MessageRepository repository;

    @Override
    public Mono<Long> create(MessageDTO body) {
        return repository.save(body.mapToEntity()).subscribeOn(Schedulers.boundedElastic()).map(Message::getId);
    }

    @Override
    public Mono<Void> update(Long id, MessageDTO body) {
        return repository.findById(id)
                .map(Optional::of)
                .defaultIfEmpty(Optional.empty())
                .flatMap(optionalTutorial -> {
                        var m = optionalTutorial.orElseThrow(()-> new ResourceNotFoundException("not found message in db"));
                        return repository.save(body.mapToEntity().setId(m.getId())).as(v->Mono.empty());
                    }
                );
    }
}
