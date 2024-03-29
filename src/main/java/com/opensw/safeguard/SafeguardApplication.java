package com.opensw.safeguard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling // scheduler 설정
@EnableJpaAuditing // auditing 설정
@SpringBootApplication
public class SafeguardApplication {

	public static void main(String[] args) {
		SpringApplication.run(SafeguardApplication.class, args);
	}

}
