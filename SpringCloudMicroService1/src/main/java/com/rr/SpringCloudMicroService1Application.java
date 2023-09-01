package com.rr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(Config.class)
public class SpringCloudMicroService1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudMicroService1Application.class, args);
	}

}
