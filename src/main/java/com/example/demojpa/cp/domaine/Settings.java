package com.example.demojpa.cp.domaine;

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
    private Boolean random;
    private Boolean custom;
}
