package com.example.demojpa.control_plane.domaine;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Table(name = "settings")
@Builder
public class Settings {
    private Integer poolSize;
    private Integer messageSize;
    private Integer messageCount;
    private Boolean random;
    private Boolean custom;
}
