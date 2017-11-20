package com.hxf.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@EnableTransactionManagement
@EnableScheduling
@ComponentScan("com.hxf.controller")
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(Application.class, args);
		
	}

}
