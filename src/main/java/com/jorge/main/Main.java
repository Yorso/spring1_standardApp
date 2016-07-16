package com.jorge.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jorge.config.AppConfig;
import com.jorge.config.User;

public class Main {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext springContext = new AnnotationConfigApplicationContext(AppConfig.class);//Creates Spring context object from the AppConfig class...
		User admin = (User) springContext.getBean("admin"); //...and retrieved the admin bean from it
		
		System.out.println("admin name: " + admin.getName());
		System.out.println("admin skill: " + admin.getSkill());
		
		springContext.close(); // Close the Spring context
	}
}
