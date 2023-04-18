package com.example.demojpa.ports;

import com.example.demojpa.app.command.message.CommandMessageHandler;
import com.example.demojpa.app.query.message.QueryMessageHandler;
import com.example.demojpa.domain.message.Message;
import com.example.demojpa.domain.message.MessageDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/message")
@RequiredArgsConstructor
public class MessageController {
    private final QueryMessageHandler queryMessageHandler;
    private final CommandMessageHandler commandMessageHandler;

    @GetMapping("/")
    public List<Message> getMessageList(){
        return queryMessageHandler.getMessageListHandler();
    }

    @GetMapping("/{id}")
    public Message getMessageById(@PathVariable Long id){
        return queryMessageHandler.getMessageByIdHandler(id);
    }

    @PostMapping("/")
    public Long create(@RequestBody MessageDTO body){
       return commandMessageHandler.createMessage(body);
    }

    @PostMapping("/{id}")
    public void update(@PathVariable Long id,@RequestBody MessageDTO body){
        commandMessageHandler.updateMessage(id,body);
    }


}
