package com.uce.edu.demo.tarea8.repository;

import com.uce.edu.demo.tarea8.modelo.Producto;

public interface IProductoRepository {

	public void insertar(Producto p);

	public void actualizar(Producto p);

	public Producto buscar(String nombreProducto);

	public void eliminar(Producto p);

}
