package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {

	public void insertar(CuentaBancaria c);

	public void actualizar(CuentaBancaria c);

	public CuentaBancaria buscar(String numero);

	public void eliminar(CuentaBancaria c);

}
