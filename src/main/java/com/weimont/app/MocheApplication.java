package com.weimont.app;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.weimont.app.entity.Empleado;
import com.weimont.app.repository.EmpleadoRepository;

@SpringBootApplication
public class MocheApplication {

	public static void main(String[] args) {
		SpringApplication.run(MocheApplication.class, args);
	}
	
	@Bean
	ApplicationRunner applicationRunner(EmpleadoRepository empleadoRepository) {
		return args -> {
			empleadoRepository.save(new Empleado((long) 1, "Carlos Valderrama", "Vendedor", (long) 15155));
			empleadoRepository.save(new Empleado((long) 2, "Diego Maradona", "Vendedor", (long) 2111));
			empleadoRepository.save(new Empleado((long) 3, "Flavio Maestri", "Vendedor", (long) 54566));
			empleadoRepository.save(new Empleado((long) 4, "Checho Ibarra", "Vendedor", (long) 788787));
		};
	}

}
