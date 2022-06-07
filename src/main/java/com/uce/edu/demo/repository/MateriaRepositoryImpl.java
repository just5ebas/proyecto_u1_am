package com.uce.edu.demo.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Materia;

@Repository
public class MateriaRepositoryImpl implements IMateriaRepository {

	@Override
	public void insertar(Materia materia) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado en la base la materia: " + materia);
	}

	@Override
	public Materia buscar(String materia) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado en la base la materia: " + materia);
		Materia m = new Materia();
		m.setNombre(materia);
		return m;
	}

	@Override
	public void actualizar(Materia materia) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado en la base la materia: " + materia);
	}

	@Override
	public void eliminar(String materia) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado en la base la materia " + materia);
	}

}
