package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.dao.userRepository;
import com.spring.entities.user;

@SpringBootApplication(scanBasePackages = "com.spring")
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);
		
		userRepository user1 =context.getBean(userRepository.class);
		user user2 = new user();
		
		user2.setName("Radha");
		user2.setCity("Barsana");
		user2.setStatus("Devi Maa");
		
		user1.save(user2);
				
	}

}
