package com.example.demojpa.app.properties;

import com.example.demojpa.generator.domain.channel.ChannelType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ControlPlaneProperties {
    private ChannelType[] channelTypes;
}
