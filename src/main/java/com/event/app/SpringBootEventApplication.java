package com.event.app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.event.app.publisher.UserPublisher;

@SpringBootApplication
public class SpringBootEventApplication { // implements CommandLineRunner (otra forma)

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEventApplication.class, args);
	}

	@Bean
	CommandLineRunner init(UserPublisher userPublisher) {  // Inyección automática
		// Ejecutar cuando se levante la aplicación
		return args -> {
			// Se pueden publicar multiples eventos
			//userPublisher.publishUserRegisteredEvent("diego", "1234", (byte) 30);
			userPublisher.publishUserRegisteredEvent("silvis", "1234", (byte) 29);
			
			// Publicar el evento manualmente
			userPublisher.publishUserValidatedEvent("diego", false);
		};
	}

	
}
