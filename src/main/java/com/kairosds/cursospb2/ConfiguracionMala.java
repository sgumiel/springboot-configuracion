package com.kairosds.cursospb2;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "saludo.mayusculas")
public class ConfiguracionMala {

    private String corto;
    private String largo;
}
