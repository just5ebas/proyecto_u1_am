package com.uce.edu.demo.tarea8.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.tarea8.modelo.Producto;
import com.uce.edu.demo.tarea8.repository.IProductoRepository;

@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	private IProductoRepository iProductoRepository;

	@Override
	public void comprarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.insertar(p);
	}

	@Override
	public void actualizarInformacion(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.actualizar(p);
	}

	@Override
	public Producto buscarProducto(String nombreProducto) {
		// TODO Auto-generated method stub
		return this.iProductoRepository.buscar(nombreProducto);
	}

	@Override
	public void eliminarProducto(Producto p) {
		// TODO Auto-generated method stub
		this.iProductoRepository.eliminar(p);
	}

}
