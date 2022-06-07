package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Matricula;

public interface IMatriculaService {

	public void ingresarMatricula(Matricula matricula);

	public Matricula buscarMatricula(String numeroMatricula);

	public void actualizarMatricula(Matricula matricula);

	public void borrarMatricula(String numeroMatricula);

}
