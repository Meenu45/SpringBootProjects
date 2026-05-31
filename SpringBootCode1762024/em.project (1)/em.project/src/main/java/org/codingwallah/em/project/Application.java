package org.codingwallah.em.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLOutput;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		System.out.println("hello world");
		SpringApplication.run(Application.class, args);
	}

}
