package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Service
@Qualifier("ahorro")
public class CuentaBancariaAhorrosServiceImpl implements ICuentaBancariaService {

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
	public BigDecimal calcularInteres(String numeroCta, BigDecimal sueldo) {
		// TODO Auto-generated method stub
		// Codigo duplicado solucionado con una fachada
//		CuentaBancaria cta = this.bancariaRepository.buscar(numeroCta); 
//		BigDecimal saldo = sueldo;
		BigDecimal interes = new BigDecimal(560).multiply(new BigDecimal(15)).divide(new BigDecimal(100));
		interes = interes.add(sueldo.divide(new BigDecimal(100)));

		return interes;
	}

}
