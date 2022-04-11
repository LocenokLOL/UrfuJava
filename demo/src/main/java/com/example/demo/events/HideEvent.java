package com.example.demo.events;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class HideEvent {
    @Getter
    private final String message;

    public HideEvent( String message){
        this.message=message;
    }
}
