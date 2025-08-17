package com.arsenal.ecomm.shopperstop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class ShopperstopApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopperstopApplication.class, args);
	}

}
