package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.repository.IDepositoRepository;
import com.uce.edu.demo.banco.repository.IRetiroRepository;
import com.uce.edu.demo.banco.repository.ITransferenciaRepository;
import com.uce.edu.demo.banco.to.TransaccionTO;

@Service
public class TransaccionServiceImpl implements ITransaccionService {

	@Autowired
	private ITransferenciaService iTransferenciaService;

	@Autowired
	private IDepositoService iDepositoService;

	@Autowired
	private IRetiroService iRetiroService;

	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;

	@Autowired
	private IDepositoRepository iDepositoRepository;

	@Autowired
	private IRetiroRepository iRetiroRepository;

	@Override
	public void transferencia(String origen, String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iTransferenciaService.realizar(origen, destino, monto);
	}

	@Override
	public void deposito(String destino, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iDepositoService.realizar(destino, monto);
	}

	@Override
	public void retiro(String ctaRetiro, BigDecimal monto) {
		// TODO Auto-generated method stub
		this.iRetiroService.retirar(ctaRetiro, monto);
	}

	@Override
	public List<TransaccionTO> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Transferencia> listaTransf = this.iTransferenciaRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Deposito> listaDepo = this.iDepositoRepository.consultar(cuenta, fechaInicio, fechaFin);
		List<Retiro> listaReti = this.iRetiroRepository.consultar(cuenta, fechaInicio, fechaFin);

		// Vamos a unir todas las listas
		List<TransaccionTO> listaFinal = new ArrayList<>();

		for (Transferencia t : listaTransf) {
			TransaccionTO transaccionTO = this.transformar(t);
			listaFinal.add(transaccionTO);
		}

		for (Deposito d : listaDepo) {
			TransaccionTO transaccionTO = this.transformar(d);
			listaFinal.add(transaccionTO);
		}

		for (Retiro r : listaReti) {
			TransaccionTO transaccionTO = this.transformar(r);
			listaFinal.add(transaccionTO);
		}

		return listaFinal;
	}

	// Estos metodos serviran para hcaer un cast
	private TransaccionTO transformar(Transferencia transferencia) {
		TransaccionTO tranTO = new TransaccionTO();
		tranTO.setFecha(transferencia.getFechaTransferencia());
		tranTO.setMonto(transferencia.getMontoTransferir());
		tranTO.setTipo("T");
		return tranTO;
	}

	private TransaccionTO transformar(Deposito deposito) {
		TransaccionTO tranTO = new TransaccionTO();
		tranTO.setFecha(deposito.getFecha());
		tranTO.setMonto(deposito.getMonto());
		tranTO.setTipo("D");
		return tranTO;
	}

	private TransaccionTO transformar(Retiro retiro) {
		TransaccionTO tranTO = new TransaccionTO();
		tranTO.setFecha(retiro.getFechaRetiro());
		tranTO.setMonto(retiro.getMonto());
		tranTO.setTipo("R");
		return tranTO;
	}

}
