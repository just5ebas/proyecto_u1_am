package com.uce.edu.demo.tarea8.repository;

import com.uce.edu.demo.tarea8.modelo.Inventario;

public interface IInventarioRepository {
	
	public void insertar(Inventario i);

	public void actualizar(Inventario i);

	public Inventario buscar(String idInventario);

	public void eliminar(Inventario i);
	
}
