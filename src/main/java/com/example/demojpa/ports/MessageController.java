package com.example.demojpa.ports;

import com.example.demojpa.app.query.message.QueryMessage;
import com.example.demojpa.domain.Message;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/message")
@RequiredArgsConstructor
public class MessageController {
    private final QueryMessage handler;

    @GetMapping("/")
    public List<Message> getMessageList(){
        return handler.getMessageListHandler();
    }

    @GetMapping("/{id}")
    public Message getMessageById(@PathVariable Long id){
        return handler.getMessageByIdHandler(id);
    }

}
