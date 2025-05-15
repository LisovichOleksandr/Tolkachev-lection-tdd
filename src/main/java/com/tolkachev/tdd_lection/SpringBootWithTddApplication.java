package com.tolkachev.tdd_lection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@EnableConfigurationProperties(HttpProperties.class)
@SpringBootApplication
public class SpringBootWithTddApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithTddApplication.class, args);
	}

}
