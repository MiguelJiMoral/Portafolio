package com.mijim.usuarios.tareaslista;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class TareasListaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareasListaApplication.class, args);
	}

}
