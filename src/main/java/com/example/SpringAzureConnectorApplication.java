package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.example.property.MessageProperties;

@SpringBootApplication
@EnableConfigurationProperties(MessageProperties.class)
public class SpringAzureConnectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAzureConnectorApplication.class, args);
	}

}
