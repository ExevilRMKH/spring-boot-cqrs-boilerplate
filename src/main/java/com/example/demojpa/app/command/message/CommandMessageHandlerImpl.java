package com.example.demojpa.app.command.message;

import com.example.demojpa.app.ResourceNotFoundException;
import com.example.demojpa.domain.message.MessageDTO;
import com.example.demojpa.domain.message.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CommandMessageHandlerImpl implements CommandMessageHandler {
    private final MessageRepository repository;

    @Override
    public Long createMessage(MessageDTO body) {
        return repository.save(body.mapToEntity()).getId();
    }

    @Override
    public void updateMessage(Long id,MessageDTO body) {
        repository.findById(id).orElseThrow(() -> new ResourceNotFoundException("message not exist by id"));
        repository.save(body.mapToEntity());
    }
}
