package com.capg.demo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class MovieApiGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieApiGatewayServiceApplication.class, args);
	}

}
