package com.uce.edu.demo.tarea8.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.tarea8.modelo.Inventario;
import com.uce.edu.demo.tarea8.modelo.Producto;
import com.uce.edu.demo.tarea8.repository.IInventarioRepository;

@Service
public class InventarioServiceImpl implements IInventarioService {

	@Autowired
	private IInventarioRepository iInventarioRepository;

	@Override
	public void insertarProductos(Inventario i, Producto... productos) {
		// TODO Auto-generated method stub
		List<Producto> lista = new ArrayList<Producto>();

		for (Producto p : productos) {
			lista.add(p);
		}
		i.setListaProductos(lista);

		this.iInventarioRepository.insertar(i);
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.actualizar(i);
	}

	@Override
	public Inventario buscar(String idInventario) {
		// TODO Auto-generated method stub
		return this.iInventarioRepository.buscar(idInventario);
	}

	@Override
	public void eliminar(Inventario i) {
		// TODO Auto-generated method stub
		this.iInventarioRepository.eliminar(i);
	}

}
