package com.example.demojpa.generator.domain.channel;

import com.example.demojpa.generator.adapters.ChannelPublisher;
import com.example.demojpa.generator.adapters.brokers.kafka.KafkaChannelPublisher;
import com.example.demojpa.generator.adapters.grpc.GrpcChannelPublisher;
import com.example.demojpa.generator.adapters.rest.RestChannelPublisher;

public enum ChannelType {
    KAFKA(){
        @Override
        public ChannelPublisher getPublisher(){
            return new KafkaChannelPublisher();
        }
    },
    GRPC(){
        @Override
        public ChannelPublisher getPublisher(){
            return new GrpcChannelPublisher();
        }
    },
    REST(){
        @Override
        public ChannelPublisher getPublisher(){
            return new RestChannelPublisher();
        }
    };

    public ChannelPublisher getPublisher(){
        return new ChannelPublisher() { };
    }
}
