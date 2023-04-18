package com.example.demojpa.app.query.message;

import com.example.demojpa.domain.message.Message;

import java.util.List;

public interface QueryMessageHandler {
    List<Message> getMessageListHandler();
    Message getMessageByIdHandler(Long id);
}
