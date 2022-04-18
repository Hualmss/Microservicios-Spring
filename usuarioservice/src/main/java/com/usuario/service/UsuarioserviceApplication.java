package com.usuario.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



@EnableFeignClients/* habilita al cliente feing, con esto s epuede llamar a los demas microservicos */
@SpringBootApplication
public class UsuarioserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UsuarioserviceApplication.class, args);
	}

}
