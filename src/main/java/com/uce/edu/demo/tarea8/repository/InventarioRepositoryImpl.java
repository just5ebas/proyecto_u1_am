package com.uce.edu.demo.tarea8.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.tarea8.modelo.Inventario;
import com.uce.edu.demo.tarea8.modelo.Producto;

@Repository
public class InventarioRepositoryImpl implements IInventarioRepository {

	@Override
	public void insertar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se ingreso a la base de datos el inventario: " + i);
	}

	@Override
	public void actualizar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo en la base de datos el inventario: " + i);
	}

	@Override
	public Inventario buscar(String idInventario) {
		// TODO Auto-generated method stub
		Inventario i = new Inventario();
		i.setId(idInventario);
		return i;
	}

	@Override
	public void eliminar(Inventario i) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino de la base de datos el inventario: " + i);
	}

}
