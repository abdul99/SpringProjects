package com.abdul.springproects.templates.security;

 

import org.springframework.beans.factory.annotation.Autowired;
 
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;


@EnableWebSecurity
 
 
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	protected void configure(HttpSecurity http) throws Exception{
	
		http
			.formLogin().permitAll()
		.and()
			.authorizeRequests()
			.antMatchers("/hello").hasRole("USER")
			.antMatchers("/hello", "/greeting").hasRole("ADMIN")
			.anyRequest().authenticated()
		.and()
			.exceptionHandling().accessDeniedPage("/unauthorized");
	}

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		auth
		.inMemoryAuthentication()
			.withUser("user").password("password").roles("USER")
			.and()
			.withUser("admin").password("adminpass").roles("ADMIN");
	}
	
}