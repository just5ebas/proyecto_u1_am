package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Deposito;

public interface IDepositoService {

	public void realizar(String numeroCtaDestino, BigDecimal monto);

	public void actualizarInformacion(Deposito d);

	public Deposito buscarRegistro(String numeroCuenta);

	public void eliminarRegistro(Deposito d);

}
