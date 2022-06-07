package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Materia;

public interface IMateriaService {

	public void ingresarMateria(Materia materia);

	public Materia buscarMateria(String materia);

	public void actualizarMateria(Materia materia);

	public void borrarMateria(String materia);

}
