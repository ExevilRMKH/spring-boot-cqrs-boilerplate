package com.example.demojpa.control_plane.domaine;

import lombok.Getter;
import lombok.Setter;

import java.util.Map;

@Getter
@Setter
public class RunInfo {
    private long poolSize;
    private long amountMessageSend;
    private Map<String,Long> countMessageSendForTread;

}
