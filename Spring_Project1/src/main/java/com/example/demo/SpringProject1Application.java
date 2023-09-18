package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringProject1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringProject1Application.class, args);

		//Dependency Injection
		Home h = context.getBean(Home.class); //getBean -- class
		h.connect();
		
		//SingleTon Object - single time obj gets created
		//Bean Object - (Seed)
		//Home h2 = context.getBean(Home.class); //getBean -- class
		//h2.connect();
		
		/*  - Tightly coupled
		Home h = new Home();
		h.connect();
		*/
		
		
	}

}
