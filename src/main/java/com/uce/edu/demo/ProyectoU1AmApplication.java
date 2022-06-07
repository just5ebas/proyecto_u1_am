package com.uce.edu.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoU1AmApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Estudiante e = new Estudiante();
		e.setNombre("Ariel");
		e.setApellido("Maldonado");
		e.setCedula("1750844787");

		this.estudianteService.ingresarEstudiante(e);

		Estudiante e1 = new Estudiante();
		e1.setNombre("Edison");
		e1.setApellido("Cayambe");
		e1.setCedula("0943344567");

		this.estudianteService.ingresarEstudiante(e1);

		// Usar los 3 métodos restantes
		e.setCedula("1710738384");
		this.estudianteService.actualizarEstudiante(e);

		this.estudianteService.buscarPorApellido("Maldonado");

		this.estudianteService.borrarEstudiante("0943344567");
	}

}
