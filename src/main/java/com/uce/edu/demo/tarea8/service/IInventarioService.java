package com.uce.edu.demo.tarea8.service;

import com.uce.edu.demo.tarea8.modelo.Inventario;
import com.uce.edu.demo.tarea8.modelo.Producto;

public interface IInventarioService {

	public void insertarProductos(Inventario i, Producto... productos);

	public void actualizar(Inventario i);

	public Inventario buscar(String idInventario);

	public void eliminar(Inventario i);
}
