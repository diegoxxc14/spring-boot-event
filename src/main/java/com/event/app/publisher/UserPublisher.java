package com.event.app.publisher;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.event.app.event.UserRegisteredEvent;
import com.event.app.event.UserValidatedEvent;

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
        log.info("PUBLISH: Event has been published: publishUserRegisteredEvent");
        applicationEventPublisher.publishEvent(new UserRegisteredEvent(username, password, age));
    }

    public void publishUserValidatedEvent(String username, boolean isValid) {
        log.info("PUBLISH: Event has been published: publishUserValidatedEvent");
        applicationEventPublisher.publishEvent(new UserValidatedEvent(username, isValid));
    }
}
