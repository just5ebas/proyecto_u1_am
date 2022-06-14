package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("ahorro_futuro")
public class CuentaBancariaAhorroFuturoServiceImpl implements ICuentaBancariaService {

	@Override
	public void insertar(CuentaBancaria c) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actualizar(CuentaBancaria c) {
		// TODO Auto-generated method stub

	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(CuentaBancaria c) {
		// TODO Auto-generated method stub

	}

	@Override
	public BigDecimal calcularInteres(String numeroCta, BigDecimal saldo) {
		// TODO Auto-generated method stub
		BigDecimal interes = saldo.add(new BigDecimal(50)).multiply(new BigDecimal(5)).divide(new BigDecimal(100));

		return interes;
	}

}
