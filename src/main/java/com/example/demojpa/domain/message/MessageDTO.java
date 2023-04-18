package com.example.demojpa.domain.message;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageDTO {
    private String body;

    public Message mapToEntity(){
        return new Message().setBody(this.body);
    }
}
