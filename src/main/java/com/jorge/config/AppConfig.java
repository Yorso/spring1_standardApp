/**
 * The simplest way to define a bean is to create, in a Spring configuration class, a method annotated
 * with @Bean returning an object (the actual bean). Such beans are usually used to configure Spring in
 * some way (database, security, view resolver, and so on)
 * 
 */
package com.jorge.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration // This annotation declares this class as a Spring configuration class
public class AppConfig {

	@Bean // Defining a bean explicitly. All beans in Spring are Singleton by default.
	public User admin() {
		User u = new User();
		u.setName("Merlin");
		u.setSkill("Magic");
		return u;
	}

}
