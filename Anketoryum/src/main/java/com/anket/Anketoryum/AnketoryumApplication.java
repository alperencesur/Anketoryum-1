package com.anket.Anketoryum;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AnketoryumApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnketoryumApplication.class, args);
	}

}
