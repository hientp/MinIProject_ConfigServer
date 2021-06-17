package com.ironhack.MinIProject_ConfigServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MinIProjectConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MinIProjectConfigServerApplication.class, args);
	}

}
