package com.example.demojpa.generator.domain;

import com.example.demojpa.generator.domain.channel.Channel;
import com.example.demojpa.generator.domain.message.Message;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Event {
    private Channel channel;
    private Message message;
}
