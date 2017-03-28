package de.holisticon.mgu.spring.boot.elk.example.logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootLoggerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggerApplication.class, args);
	}
}
