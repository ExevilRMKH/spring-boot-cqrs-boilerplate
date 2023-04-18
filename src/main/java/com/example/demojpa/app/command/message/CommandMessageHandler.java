package com.example.demojpa.app.command.message;

import com.example.demojpa.domain.message.MessageDTO;

public interface CommandMessageHandler {
    Long createMessage(MessageDTO body);
    void updateMessage(Long id,MessageDTO body);
}
