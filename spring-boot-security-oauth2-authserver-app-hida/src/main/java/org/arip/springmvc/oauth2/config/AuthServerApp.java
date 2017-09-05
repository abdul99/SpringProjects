package org.arip.springmvc.oauth2.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

 
@SpringBootApplication
public class AuthServerApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		 
		SpringApplication.run(AuthServerApp.class, args);
	}

}
