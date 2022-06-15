package com.uce.edu.demo;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.ProfesorGeneral;
import com.uce.edu.demo.modelo.ProfesorMateria;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1AmApplication implements CommandLineRunner {

	@Autowired
	private ProfesorGeneral profesor1;

	@Autowired
	private ProfesorGeneral profesor2;

	@Autowired
	private ProfesorMateria mat1;

	@Autowired
	private ProfesorMateria mat2;
	
	@Autowired
	private IMatriculaService iMatriculaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Singleton
		System.out.println("\n  Singleton:");

		this.profesor1.setNombre("Ariel");
		this.profesor1.setApellido("Maldonado");

		System.out.println(this.profesor1);

		System.out.println("  - - - - - - - ");

		System.out.println(this.profesor2);
		this.profesor2.setNombre("Lucho");

		System.out.println(" - - - - - - - ");

		System.out.println(this.profesor1);

		System.out.println("  - - - - - - - ");

		System.out.println(this.profesor2);

		// Prototype
		System.out.println("\n  Prototype:");

		this.mat1.setNombre("Daniel");
		this.mat1.setApellido("Terán");

		System.out.println(this.mat1);

		System.out.println("  - - - - - - - ");

		System.out.println(this.mat2);
		
		Matricula matricula1 = new Matricula();
		matricula1.setEstudiante(new Estudiante());
		matricula1.setMateria(new ArrayList<Materia>());
		matricula1.setNumeroMatricula("13123");
		
		this.iMatriculaService.ingresarMatricula(matricula1);

	}

}
