package com.abdul.spring.security.config;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
 
@Configuration
@Profile({"customuserdetails","encodedcustompassword"})
public class MongoConfiguration {

    @Bean
    public MongoClient createConnection() {

        //put your real ip here
        return new MongoClient("127.0.0.1:27017");
    }
}
