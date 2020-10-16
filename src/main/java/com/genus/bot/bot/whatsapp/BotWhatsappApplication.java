package com.genus.bot.bot.whatsapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class BotWhatsappApplication implements ApplicationRunner {

	public static void main(String[] args) {
		SpringApplication.run(BotWhatsappApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
	}
}
