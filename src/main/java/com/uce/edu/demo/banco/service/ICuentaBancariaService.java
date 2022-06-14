package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

public interface ICuentaBancariaService {

	public void insertar(CuentaBancaria c);

	public void actualizar(CuentaBancaria c);

	public CuentaBancaria buscar(String numero);

	public void eliminar(CuentaBancaria c);

	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo);

}
