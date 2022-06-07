package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaRepository {

	// CRUD
	// C: crear / insertar
	public void insertar(Matricula matricula);

	// R: leer / buscar
	public Matricula buscar(String numeroMatricula);

	// U: actualizar
	public void actualizar(Matricula matricula);

	// D: eliminar / borrar
	public void eliminar(String numeroMatricula);

}
