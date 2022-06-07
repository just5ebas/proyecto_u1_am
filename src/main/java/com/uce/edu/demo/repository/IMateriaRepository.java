package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaRepository {

	// CRUD
	// C: crear / insertar
	public void insertar(Materia materia);

	// R: leer / buscar
	public Materia buscar(String materia);

	// U: actualizar
	public void actualizar(Materia materia);

	// D: eliminar / borrar
	public void eliminar(String materia);

}
