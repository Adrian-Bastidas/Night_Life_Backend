package com.NightLife.Locales;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LocalesApplication {

	public static void main(String[] args) {
		SpringApplication.run(LocalesApplication.class, args);
	}



}
