package com.example.eCommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ECommerceApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =  SpringApplication.run(ECommerceApplication.class, args);

		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
 