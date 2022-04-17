package com.usuario.service.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}


/* 
una clase que guarda beans 
IOC container - contenedor de spring se tiene que añadir la configuracion de @configuration

*/