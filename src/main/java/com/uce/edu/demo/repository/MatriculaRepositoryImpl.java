package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Estudiante;
import com.uce.edu.demo.modelo.Matricula;

@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@Override
	public void insertar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la matricula: " + matricula);
	}

	@Override
	public Matricula buscar(String numeroMatricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la matricula de numero: " + numeroMatricula);
		Matricula m = new Matricula();
		m.setNumeroMatricula(numeroMatricula);
		return m;
	}

	@Override
	public void actualizar(Matricula matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la matricula: " + matricula);
	}

	@Override
	public void eliminar(String numeroMatricula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la matricula con numero:  " + numeroMatricula);
	}

//	@Override
//	public void insertar(Estudiante e) {
//		// TODO Auto-generated method stub
//		// Aqui se realiza la insercion en la base de datos
//		System.out.println("Se ha insertado en la base el estudiante: " + e);
//	}
//
//	@Override
//	public Estudiante buscar(String apellido) {
//		// TODO Auto-generated method stub
//		// Aqui se realiza la busqueda en la base de datos
//		System.out.println("Se ha buscado en la base el estudiante de apellido: " + apellido);
//		Estudiante e = new Estudiante();
//		e.setApellido(apellido);
//		return e;
//	}
//
//	@Override
//	public void actualizar(Estudiante e) {
//		// TODO Auto-generated method stub
//		// Aqui se realiza la actualizacion en la base de datos
//		System.out.println("Se ha actualizado en la base el estudiante: " + e);
//	}
//
//	@Override
//	public void eliminar(String cedula) {
//		// TODO Auto-generated method stub
//		// Aqui se realiza la eliminacion en la base de datos
//		System.out.println("Se ha eliminado en la base el estudiante con cedula " + cedula);
//	}

}
