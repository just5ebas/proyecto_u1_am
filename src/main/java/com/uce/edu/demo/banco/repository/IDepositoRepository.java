package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoRepository {

	public void insertarDeposito(Deposito d);

	public void actualizarDeposito(Deposito d);

	public Deposito buscar(String numeroCuenta);

	public void eliminar(Deposito d);

}
