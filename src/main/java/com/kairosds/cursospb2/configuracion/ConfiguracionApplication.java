package com.kairosds.cursospb2.configuracion;

import com.kairosds.cursospb2.ConfiguracionMala;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication(scanBasePackages = "com.kairosds.cursospb2")
public class ConfiguracionApplication {

	@Autowired
	private ConfiguracionMala configuracionMala;

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
			System.out.println(configuracionMala.getCorto());
		};
	}

}
