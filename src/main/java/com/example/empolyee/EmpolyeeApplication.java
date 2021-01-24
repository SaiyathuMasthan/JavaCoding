package com.example.empolyee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class EmpolyeeApplication {

	private static final Logger logger = LoggerFactory.getLogger(EmpolyeeApplication.class);

	public static void main(String[] args) {
		logger.info(" EmpolyeeApplication started");
		SpringApplication.run(EmpolyeeApplication.class, args);
	}

}
