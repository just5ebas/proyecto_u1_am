package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroRepository {

	public void insertar(Retiro r);

	public void actualizar(Retiro r);

	public Retiro buscar(String numeroCuenta);

	public void eliminar(Retiro r);

}
