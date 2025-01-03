package com.example.springjpaproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringJpaProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaProjectApplication.class, args);
	}

}
