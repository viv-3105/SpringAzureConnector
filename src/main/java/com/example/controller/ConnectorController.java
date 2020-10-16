package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.property.MessageProperties;

@RestController
public class ConnectorController {

	private final MessageProperties properties;

	public ConnectorController(MessageProperties properties) {
        this.properties = properties;
    }

	@GetMapping("message")
	public String getMessage() {
		return "Message: " + properties.getMessage();
	}

}
