package com.example.demojpa.app.query.message;

import com.example.demojpa.domain.Message;

import java.util.List;

public interface QueryMessage{
    List<Message> getMessageListHandler();
    Message getMessageByIdHandler(Long id);
}
