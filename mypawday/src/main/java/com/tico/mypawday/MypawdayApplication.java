package com.tico.mypawday;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MypawdayApplication {

	public static void main(String[] args) {
		SpringApplication.run(MypawdayApplication.class, args);
	}

}
