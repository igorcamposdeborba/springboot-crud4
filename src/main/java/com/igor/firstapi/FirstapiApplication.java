package com.igor.firstapi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.igor.firstapi.domain.Users;
import com.igor.firstapi.repositories.UsersRepository;


@SpringBootApplication
public class FirstapiApplication implements CommandLineRunner {

	@Autowired
	private UsersRepository userRepository; 
	
	public static void main(String[] args) {
		SpringApplication.run(FirstapiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Users user1 = new Users(null, "Igor Borba", "Igor", "123456");
		Users user2 = new Users(null, "Camila da Silva", "Camila", "abcdef");
		Users user3 = new Users(null, "André da Silva", "André", "qwerty");
		Users user4 = new Users(null, "Bianca Nunes", "Bianca", "123456");
		
		userRepository.saveAll(Arrays.asList(user1, user2, user3, user4));
	}

}
