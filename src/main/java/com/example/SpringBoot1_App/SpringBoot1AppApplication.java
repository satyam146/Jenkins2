package com.example.SpringBoot1_App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot1AppApplication implements commandLineRunner{

	@Override
	public void run(String args[]) throws Exception {
		System.out.println("Hello World");
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}
	}


