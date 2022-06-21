package com.santosediego.integrations.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.santosediego.integrations.services.EmailService;
import com.santosediego.integrations.services.MockEmailService;

@Configuration
@Profile("test")
public class TestConfig {
	//Padrão de projeto Strategy para usar mais de um EmailService - Complementos Envio de email;

	@Bean
	public EmailService emailService() {
		return new MockEmailService();
	}
}
