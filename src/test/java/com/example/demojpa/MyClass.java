package com.example.demojpa;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.function.Consumer;

@Getter
@Builder
@Slf4j
public class MyClass{
    private Long id;
    private String name;

    public void apply(Consumer<MyClass> consumer){
        consumer.accept(this);
    };
}
