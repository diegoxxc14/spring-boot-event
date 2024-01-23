package com.event.app.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.event.app.event.UserRegisteredEvent;

import lombok.extern.slf4j.Slf4j;

@Component
@Slf4j
public class UserPublisher {
    
    private final ApplicationEventPublisher applicationEventPublisher;

    public UserPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    // Publicar el evento
    public void publishUserRegisteredEvent(String username, String password, byte age) {
        log.info("PUBLISH: Event has been published");
        applicationEventPublisher.publishEvent(new UserRegisteredEvent(username, password, age));
    }
}
