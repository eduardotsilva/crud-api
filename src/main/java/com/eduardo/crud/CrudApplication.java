package com.eduardo.crud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.rest.RepositoryRestMvcAutoConfiguration;

@SpringBootApplication
public class CrudApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CrudApplication.class, args);
	}

}
