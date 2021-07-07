package com.eduardo.crud.config;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


public class SwaggerConfig {

	@Bean
	public Docket docket() {

		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.eduardo.crud.controller")).paths(PathSelectors.any())
				.build().apiInfo(apiInfo());

	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("microserviço-auth")
				.description("Gera o token JWT para os microserviços-crud/pagamento").version("1.0").contact(contact())
				.build();
	}

	private Contact contact() {
		return new Contact("Eduardo Tadeu", "https://github.com/eduardotsilva", "eduardo.tsilva@hotmail.com");
	}
}
