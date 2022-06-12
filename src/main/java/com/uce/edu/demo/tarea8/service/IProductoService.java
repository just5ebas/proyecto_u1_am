package com.uce.edu.demo.tarea8.service;

import com.uce.edu.demo.tarea8.modelo.Producto;

public interface IProductoService {

	public void comprarProducto(Producto p);

	public void actualizarInformacion(Producto p);

	public Producto buscarProducto(String nombreProducto);

	public void eliminarProducto(Producto p);

}
