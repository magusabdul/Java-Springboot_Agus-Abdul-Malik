package com.magusabdul.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@SpringBootApplication
public class Log4jApplication {

	private static Logger logger = LoggerFactory.getLogger(Log4jApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(Log4jApplication.class, args);

		logger.info("Appli running");
		logger.debug("Aplication debuging is start");
	}

}
