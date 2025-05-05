package com.findyourpet.findyourpet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "http://localhost:5173")
public class FindyourpetApplication {

	public static void main(String[] args) {
		SpringApplication.run(FindyourpetApplication.class, args);
	}

	@GetMapping("/api/hello")
	public String hello() {
		return "TEST: backend connectedf!";
	}
}
