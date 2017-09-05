package com.abdul.spring.templates.security;

 
 
//import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.ResourceHandlerRegistrationCustomizer;
 
import org.springframework.context.annotation.Configuration;
 
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
 
public class MvcConfig extends WebMvcConfigurerAdapter {
	//public class MvcConfig extends WebMvcAutoConfigurationAdapter {
	 

	 

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("hello");
		registry.addViewController("/hello").setViewName("hello");
		registry.addViewController("/greeting").setViewName("greeting");
		registry.addViewController("/unauthorized").setViewName("unauthorized");
	}
}