package com.JopPostings.mongoDB;


import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.info.Info;

@SpringBootApplication
public class MongoDbApplication {
	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("My Spring Boot API")
						.version("1.0.0")
						.description("This is a sample Spring Boot RESTful service"));
	}


	public static void main(String[] args) {
		SpringApplication.run(MongoDbApplication.class, args);
	}
}
