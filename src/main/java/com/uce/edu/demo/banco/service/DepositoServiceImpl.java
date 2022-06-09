package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.repository.IDepositoRepository;

@Service
public class DepositoServiceImpl implements IDepositoService {

	@Autowired
	private ICuentaBancariaService bancariaService;

	@Autowired
	private IDepositoRepository depositoRepository;

	@Override
	public void realizar(String numeroCtaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria ctaDestino = this.bancariaService.buscar(numeroCtaDestino);
		BigDecimal saldoCtaDestino = ctaDestino.getSaldo();
		BigDecimal saldoFinal = saldoCtaDestino.add(monto);
		ctaDestino.setSaldo(saldoFinal);
//		ctaDestino.setSaldo(ctaDestino.getSaldo().add(monto));
		this.bancariaService.actualizar(ctaDestino);

		Deposito deposito = new Deposito();
		deposito.setFecha(LocalDateTime.now());
		deposito.setNumeroCuenta(numeroCtaDestino);
		deposito.setMonto(monto);
		this.depositoRepository.insertarDeposito(deposito);
	}

	@Override
	public void actualizarInformacion(Deposito d) {
		// TODO Auto-generated method stub
		this.depositoRepository.actualizarDeposito(d);
	}

	@Override
	public Deposito buscarRegistro(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.depositoRepository.buscar(numeroCuenta);
	}

	@Override
	public void eliminarRegistro(Deposito d) {
		// TODO Auto-generated method stub
		this.depositoRepository.eliminar(d);
	}

}
