package com.example.DemoSpringScopeBeansAndAnnotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;


@SpringBootApplication
public class DemoSpringScopeBeansAndAnnotationsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoSpringScopeBeansAndAnnotationsApplication.class, args);
		// context.close();
	}
}
