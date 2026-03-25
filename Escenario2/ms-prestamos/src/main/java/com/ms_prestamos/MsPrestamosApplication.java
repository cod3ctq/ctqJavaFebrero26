package com.ms_prestamos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.ms_persistence.repository")
@EntityScan("com.ms_persistence.entity")
public class MsPrestamosApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsPrestamosApplication.class, args);
	}

}
