package com.ms_abonos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.ms-persistance.repository")
@EntityScan("com.ms_persistence.entity")
public class MsAbonosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAbonosApplication.class, args);
	}

}
