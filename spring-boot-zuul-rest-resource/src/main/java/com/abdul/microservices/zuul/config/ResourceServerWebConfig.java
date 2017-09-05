package com.abdul.microservices.zuul.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@EnableWebMvc
@ComponentScan({ "com.abdul.microservices.web.controller" })
public class ResourceServerWebConfig extends WebMvcConfigurerAdapter {

}
