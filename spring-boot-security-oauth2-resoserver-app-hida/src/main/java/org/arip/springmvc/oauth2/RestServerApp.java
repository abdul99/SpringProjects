package org.arip.springmvc.oauth2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;

 
@SpringBootApplication
public class RestServerApp extends SpringBootServletInitializer {

	public static void main(String[] args) {
		 
		SpringApplication.run(RestServerApp.class, args);
	}

}
