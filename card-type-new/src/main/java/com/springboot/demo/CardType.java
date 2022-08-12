package com.springboot.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.springboot.demo.repository.CardRepository;

@SpringBootApplication
public class CardType {

	public static void main(String[] args) {
		SpringApplication.run(CardType.class, args);
	}


}

