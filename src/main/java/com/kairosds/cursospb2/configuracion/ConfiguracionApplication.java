package com.kairosds.cursospb2.configuracion;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConfiguracionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfiguracionApplication.class, args);
	}

	@Bean
	CommandLineRunner execute(SaludoMayusculasConfiguration saludoMayusculasConfiguration,
							  SaludoMinusculasConfiguration saludoMinusculasConfiguration){
		return args -> {
			System.out.println(saludoMayusculasConfiguration.getCorto());
			System.out.println(saludoMayusculasConfiguration.getLargo());
			System.out.println(saludoMinusculasConfiguration.getCorto());
			System.out.println(saludoMinusculasConfiguration.getLargo());
		};
	}

}
