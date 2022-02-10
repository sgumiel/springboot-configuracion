package com.kairosds.cursospb2.configuracion;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class SaludoConfiguration {

    @Value("${saludo.corto}")
    private String corto;

    @Value("${saludo.largo}")
    private String largo;
}
