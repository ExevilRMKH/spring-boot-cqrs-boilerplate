package com.example.demojpa.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "messages")
@Getter
@Setter
public class Message {
    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "body")
    private String body;
}
