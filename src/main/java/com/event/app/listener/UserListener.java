package com.event.app.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.event.app.event.UserRegisteredEvent;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UserListener {
    
    // Escuchar el evento
    @EventListener
    public void listenerUserRegisteredEvent(UserRegisteredEvent userRegisteredEvent) {
        log.info("LISTENING: Event has been listened -> ".concat(userRegisteredEvent.toString()));
    }
}
