package com.zmlc.inmobiliaria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class InmobiliariaApplication {

	public static void main(String[] args) {
		SpringApplication.run(InmobiliariaApplication.class, args);
	}

}
