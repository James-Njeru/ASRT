package com.example.asrt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeHttpRequests().anyRequest().authenticated();
		http.formLogin();
		http.cors().disable().csrf().disable(); //POST, PUT, and DELETE

		return http.build();
	}

	
	/*
	 * @SuppressWarnings("deprecation")
	 * 
	 * @Bean public NoOpPasswordEncoder passwordEncoder() { return
	 * (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance(); }
	 */

	
	  @Bean public PasswordEncoder encoder() { return new BCryptPasswordEncoder();
	  }
	 
}