package com.example.demojpa.generator.domain.message;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Accessors(chain = true)
@Table("messages")
@ToString
public class Message {
    @Id
    private Long id;
    private String body;
}
