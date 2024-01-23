package com.event.app.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.event.app.event.UserRegisteredEvent;
import com.event.app.event.UserValidatedEvent;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UserListener {
    
    // Escuchar el evento
    @EventListener
    public UserValidatedEvent listenerUserRegisteredEvent(UserRegisteredEvent userRegisteredEvent) {
        log.info("LISTENING: Event has been listened: UserRegisteredEvent -> ".concat(userRegisteredEvent.toString()));
        // TODO: Hacer las validaciones correspondientes

        // Retornar otro evento
        return new UserValidatedEvent(userRegisteredEvent.getUsername(), true);
    }

    @EventListener
    public void listenerUserValidatedEvent(UserValidatedEvent userValidatedEvent) {
        log.info("LISTENING: Event has been listened: UserValidatedEvent -> ".concat(userValidatedEvent.toString()));
    }
}
