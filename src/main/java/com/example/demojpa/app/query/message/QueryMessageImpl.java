package com.example.demojpa.app.query.message;

import com.example.demojpa.domain.Message;
import com.example.demojpa.domain.MessageRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class QueryMessageImpl implements QueryMessage{
    private final MessageRepository repository;
    @Override
    public List<Message> getMessageListHandler() {
        return repository.findAll();
    }

    @Override
    public Message getMessageByIdHandler(Long id) {
        return repository.findById(id).orElseThrow();
    }
}
