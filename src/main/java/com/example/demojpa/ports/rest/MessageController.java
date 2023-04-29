package com.example.demojpa.ports.rest;

import com.example.demojpa.app.command.message.CommandMessageHandler;
import com.example.demojpa.app.query.message.QueryMessageHandler;
import com.example.demojpa.generator.domain.Message;
import com.example.demojpa.generator.domain.MessageDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/v1/message")
@RequiredArgsConstructor
public class MessageController {
    private final QueryMessageHandler queryMessageHandler;
    private final CommandMessageHandler commandMessageHandler;

    @GetMapping(value = "/",produces = MediaType.APPLICATION_NDJSON_VALUE)
    public Flux<Message> getMessageList(){
        return queryMessageHandler.getMessageListHandler();
    }

    @GetMapping("/{id}")
    public Mono<Message> getMessageById(@PathVariable Long id){
        return queryMessageHandler.getMessageByIdHandler(id);
    }

    @PostMapping("/")
    public Mono<Long> create(@RequestBody MessageDTO body){
       return commandMessageHandler.create(body);
    }

    @PostMapping("/{id}")
    public Mono<Void> update(@PathVariable Long id, @RequestBody MessageDTO body){
        return commandMessageHandler.update(id,body);
    }

}
