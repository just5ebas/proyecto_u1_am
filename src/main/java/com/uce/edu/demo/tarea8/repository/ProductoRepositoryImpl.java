package com.uce.edu.demo.tarea8.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.tarea8.modelo.Producto;

@Repository
public class ProductoRepositoryImpl implements IProductoRepository {

	@Override
	public void insertar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se ingreso a la base de datos el producto: " + p);
	}

	@Override
	public void actualizar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo en la base de datos el producto: " + p);
	}

	@Override
	public Producto buscar(String nombreProducto) {
		// TODO Auto-generated method stub
		Producto p = new Producto();
		p.setNombre(nombreProducto);
		p.setCantidad(100);
		p.setFechaIngreso(LocalDateTime.now());
		p.setPrecioCompra(new BigDecimal(0.45));

		return p;
	}

	@Override
	public void eliminar(Producto p) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino de la base de datos el producto: " + p);
	}

}
