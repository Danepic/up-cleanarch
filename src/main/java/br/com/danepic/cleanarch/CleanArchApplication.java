package br.com.danepic.cleanarch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class CleanArchApplication {

	public static void main(String[] args) {
		SpringApplication.run(CleanArchApplication.class, args);
	}

}
