package com.rst.oauth2.google;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
 
//import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.hascode.tutorial.Oauth2AuthorizationServerApplication;

@EnableAutoConfiguration
//@ComponentScan("com.rst.oauth2.google")
@Configuration
public class SpringBootRestApplication {
    private static Logger LOGGER = LoggerFactory.getLogger(SpringBootRestApplication.class);

    public static void main(String[] args) {
        LOGGER.info("Booting with " + SpringBootRestApplication.class.getSimpleName());
      //  SpringApplication application = new SpringApplication(SpringBootRestApplication.class);
        SpringApplication.run(SpringBootRestApplication.class, args);
       // public static void main(String[] args) {
    //		SpringApplication.run(Oauth2AuthorizationServerApplication.class, args);
    //	}
      //  application.setBannerMode(Banner.Mode.OFF);
     //   application.run(args);
        LOGGER.info("Successfully started application: " + SpringBootRestApplication.class.getSimpleName());
    }
}
