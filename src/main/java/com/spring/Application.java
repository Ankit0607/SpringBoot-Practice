package com.spring;

import java.util.List;

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
		
//		user1.save(user2);
		
//		List<user> usr =user1.findByName("Radha");
//		
//		usr.forEach(e->System.out.println(e));
		
//		List<user>usr1 = user1.findAllUser();
//		usr1.forEach(u->System.out.println(u));
		
//		List<user> usr2 = user1.findUserByOurName("Radha");
//		usr2.forEach(u->System.out.println(u));
		
		List<user> usr3 =  user1.findUserByNameAndCity("Radha", "Barsana");
		
			usr3.forEach(u->System.out.println(u));	
	}

}
