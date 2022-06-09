package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.repository.IRetiroRepository;

@Service
public class RetiroServiceImpl implements IRetiroService {

	@Autowired
	private ICuentaBancariaService bancariaService;

	@Autowired
	private IRetiroRepository iRetiroRepository;

	@Override
	public void retirar(String numeroCta, BigDecimal monto) {
		// TODO Auto-generated method stub
		CuentaBancaria cta = this.bancariaService.buscar(numeroCta);
		BigDecimal saldoCta = cta.getSaldo();
		BigDecimal saldoFinal = saldoCta.subtract(monto);
		cta.setSaldo(saldoFinal);
		this.bancariaService.actualizar(cta);

		Retiro retiro = new Retiro();
		retiro.setFechaRetiro(LocalDateTime.now());
		retiro.setNumeroCuenta(numeroCta);
		retiro.setMonto(monto);
		this.iRetiroRepository.insertar(retiro);
	}

	@Override
	public void actualizarInformacion(Retiro r) {
		// TODO Auto-generated method stub
		this.iRetiroRepository.actualizar(r);
	}

	@Override
	public Retiro buscarRegistro(String numeroCuenta) {
		// TODO Auto-generated method stub
		return this.iRetiroRepository.buscar(numeroCuenta);
	}

	@Override
	public void eliminarRegistro(Retiro r) {
		// TODO Auto-generated method stub
		this.iRetiroRepository.eliminar(r);
	}

}
