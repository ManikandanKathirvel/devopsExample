package com.mani.devopsExample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DevopsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(DevopsExampleApplication.class, args);
	}

	@RestController
	class dev{
		@PostMapping("/get")
		public ResponseEntity<?> getMsg(){
			return ResponseEntity.status(HttpStatus.OK).body("String is called");
		}
	}
}
