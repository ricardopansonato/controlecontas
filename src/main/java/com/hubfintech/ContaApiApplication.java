package com.hubfintech;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@Import({springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration.class})
@ComponentScan("com.hubfintech")
public class ContaApiApplication {
	
	public static final String API_PATH = "/api";
	
	public static void main(String[] args) {
		SpringApplication.run(ContaApiApplication.class, args);
	}
	
    @Bean
    public Docket swaggerSettings() {
    	final StringBuilder path = new StringBuilder();
    	path.append(ContaApiApplication.API_PATH);
    	path.append("/**");
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.ant(path.toString()))
                .build()
                .pathMapping("/");
    }
}
