package com.sathones.github.actions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubActionsDemoApplication {
	
	@GetMapping("/message")
	public String getMessage() {
		return "Welcome to sathones learnings!!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(GithubActionsDemoApplication.class, args);
	}

}
