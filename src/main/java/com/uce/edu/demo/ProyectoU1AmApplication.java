package com.uce.edu.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.service.IEstudianteService;
import com.uce.edu.demo.service.IMateriaService;
import com.uce.edu.demo.service.IMatriculaService;

@SpringBootApplication
public class ProyectoU1AmApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IMateriaService materiaService;

	@Autowired
	private IMatriculaService matriculaService;

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

		// ****************************************************
		// Tarea 6: Componentes de negocio

		// Materia
		Materia m1 = new Materia();
		m1.setNombre("Programacion Avanzada II");
		m1.setSemestre("Sexto");

		// insertar
		this.materiaService.ingresarMateria(m1);

		// actualizar
		m1.setNombre("Inteligencia Artificial");
		this.materiaService.actualizarMateria(m1);

		// buscar
		this.materiaService.buscarMateria(m1.getNombre());

		// eliminar
		this.materiaService.borrarMateria(m1.getNombre());

		
		// Matricula
		Matricula matricula1 = new Matricula();
		matricula1.setNumeroMatricula("001001001001");
		matricula1.setEstudiante(e);

		List<Materia> materia = new ArrayList<Materia>();
		materia.add(m1);
		matricula1.setMateria(materia);

		// insertar
		this.matriculaService.ingresarMatricula(matricula1);

		// actualizar
		matricula1.setNumeroMatricula("001002003964");
		this.matriculaService.actualizarMatricula(matricula1);

		// buscar
		this.matriculaService.buscarMatricula(matricula1.getNumeroMatricula());

		// eliminar
		this.matriculaService.borrarMatricula(matricula1.getNumeroMatricula());

	}

}
