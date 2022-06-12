package com.uce.edu.demo.tarea8.modelo;

import java.util.List;

public class Inventario {

	private String id;
	private List<Producto> listaProductos;

	@Override
	public String toString() {
		return "[" + id + "]";
	}

	// GET & SET
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Producto> getListaProductos() {
		return listaProductos;
	}

	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}

}
