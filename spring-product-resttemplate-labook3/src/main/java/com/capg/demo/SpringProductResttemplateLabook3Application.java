package com.capg.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringProductResttemplateLabook3Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringProductResttemplateLabook3Application.class, args);
	}
	@Bean
	public RestTemplate getRestTemplateBean() {
	return new RestTemplate();
	}
}
