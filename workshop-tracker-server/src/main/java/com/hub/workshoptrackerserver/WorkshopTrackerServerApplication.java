package com.hub.workshoptrackerserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class WorkshopTrackerServerApplication {

	@RequestMapping("/")
	String home() {
		return "Hello world !";
	}

	public static void main(String[] args) {
		SpringApplication.run(WorkshopTrackerServerApplication.class, args);
	}

}
