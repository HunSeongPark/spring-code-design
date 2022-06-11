package com.hunseong.eventpublisher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@EnableAsync
@SpringBootApplication
public class EventPublisherApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventPublisherApplication.class, args);
	}

}
