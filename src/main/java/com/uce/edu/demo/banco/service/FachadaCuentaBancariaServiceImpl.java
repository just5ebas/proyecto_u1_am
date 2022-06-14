package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.repository.ICuentaBancariaRepository;

@Service
public class FachadaCuentaBancariaServiceImpl implements IFachadaCuentaBancaria {

	@Autowired
	private ICuentaBancariaRepository bancariaRepository;

	@Autowired
	@Qualifier("corriente")
	private ICuentaBancariaService bancariaService;

	@Autowired
	@Qualifier("ahorro")
	private ICuentaBancariaService bancariaServiceA;

	@Autowired
	@Qualifier("ahorro_futuro")
	private ICuentaBancariaService bancariaServiceAF;

	@Override
	public BigDecimal calcularInteres(String numeroCta) {
		// TODO Auto-generated method stub
		CuentaBancaria cta = this.bancariaRepository.buscar(numeroCta);
		BigDecimal interes = null;

		if (cta.getTipo().equals("A")) {
			// Ahorros
			interes = this.bancariaServiceA.calcularInteres(numeroCta, cta.getSaldo());
		} else if (cta.getTipo().equals("C")) {
			// Corriente
			interes = this.bancariaService.calcularInteres(numeroCta, cta.getSaldo());
		} else {
			// Ahorro futuro
			interes = this.bancariaServiceAF.calcularInteres(numeroCta, cta.getSaldo());
		}

		return interes;
	}

}
