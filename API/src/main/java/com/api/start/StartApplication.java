package com.api.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Personal project with Spring Boot and Java.
 * This project is done in order to prepare a 3 months internship.
 *
 * I just created a little API on a simple table in a database.
 *
 * @author Corentin COUQ
 * @version 1.0
 *
 * Find methods :
 * @see com.api.start.web.controller.ScoreController
 * Find repository (CrudRepository implementation) :
 * @see com.api.start.repository.ScoreRepository
 * Find score model
 * @see com.api.start.model.Score
 */
@SpringBootApplication
public class StartApplication {
	/**
	 * Launch spring application
	 *
	 * @param args Main arguments
	 */
	public static void main(String[] args) {
		SpringApplication.run(StartApplication.class, args);
	}

	/**
	 * Define cors for UI (MAMP localhost:8888)
	 * @return Cors configurations
	 */
	@Bean
	public WebMvcConfigurer configurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/Scores").allowedOrigins("http://localhost:8888");
				registry.addMapping("/Scores/{id}").allowedOrigins("http://localhost:8888");
				registry.addMapping("/Scores/delete").allowedOrigins("http://localhost:8888");
				registry.addMapping("/Scores/Update").allowedOrigins("http://localhost:8888");
			}
		};
	}
}