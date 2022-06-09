package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Retiro;

public interface IRetiroService {

	public void retirar(String numeroCta, BigDecimal monto);

	public void actualizarInformacion(Retiro r);

	public Retiro buscarRegistro(String numeroCuenta);

	public void eliminarRegistro(Retiro r);

}
