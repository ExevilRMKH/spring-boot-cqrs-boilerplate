package com.example.demojpa.generator.adapters;

import com.example.demojpa.app.properties.ControlPlaneProperties;
import com.example.demojpa.control_plane.domaine.Publisher;
import com.example.demojpa.generator.adapters.brokers.kafka.KafkaChannelPublisher;
import com.example.demojpa.generator.adapters.grpc.GrpcChannelPublisher;
import com.example.demojpa.generator.adapters.rest.RestChannelPublisher;
import com.example.demojpa.generator.domain.channel.ChannelType;
import com.example.demojpa.generator.domain.message.Message;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.EnumMap;
import java.util.Objects;

@Slf4j
@Component
public class PublisherByChannel implements Publisher{
    private final EnumMap<ChannelType,ChannelPublisher> publishers;
    public PublisherByChannel(ControlPlaneProperties properties){
        var map = new EnumMap<ChannelType,ChannelPublisher>(ChannelType.class);

        for (var channelType : properties.getChannelTypes()){
            map.put(channelType,channelType.getPublisher());
        }

        this.publishers = map;
    }
    private ChannelType[] channelTypes;

    public Mono<Void> push(Message message) {
        log.info("push message: {}",message);
        return Mono.empty();
    }
}
