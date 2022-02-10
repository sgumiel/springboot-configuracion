package com.kairosds.cursospb2.configuracion;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class ConfiguracionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfiguracionApplication.class, args);
	}

	@Bean
	CommandLineRunner execute(Environment environment){
		return args -> {
			System.out.println(environment.getProperty("saludo.corto"));
			System.out.println(environment.getProperty("saludo.largo"));
		};
	}

}
