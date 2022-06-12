package com.uce.edu.demo.tarea8.service;

import java.time.LocalDateTime;

import com.uce.edu.demo.tarea8.modelo.Inventario;
import com.uce.edu.demo.tarea8.modelo.Producto;

public interface IGestorInventarioService {

	public void calcularPrecioVenta(Inventario i);

	public void ingresarProductosToBodega(Inventario i, Producto... p);

	public void imprimirInventario(Inventario i, LocalDateTime fechaFiltro);

}
