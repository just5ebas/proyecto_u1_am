package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Materia;
import com.uce.edu.demo.repository.IMateriaRepository;

@Service
public class MateriaServiceImpl implements IMateriaService {

	@Autowired
	private IMateriaRepository materiaRepository;

	@Override
	public void ingresarMateria(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.insertar(materia);
	}

	@Override
	public Materia buscarMateria(String materia) {
		// TODO Auto-generated method stub
		return this.materiaRepository.buscar(materia);
	}

	@Override
	public void actualizarMateria(Materia materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.actualizar(materia);
	}

	@Override
	public void borrarMateria(String materia) {
		// TODO Auto-generated method stub
		this.materiaRepository.eliminar(materia);
	}

}
