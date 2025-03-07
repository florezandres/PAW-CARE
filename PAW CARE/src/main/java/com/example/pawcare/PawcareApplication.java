package com.example.pawcare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class PawcareApplication {

	public static void main(String[] args) {
		SpringApplication.run(PawcareApplication.class, args);
	}

}
