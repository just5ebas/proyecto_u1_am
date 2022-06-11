package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Deposito;

@Repository
public class DepositoRepositoryImpl implements IDepositoRepository {

	@Override
	public void insertarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		System.out.println("Se creo el deposito: " + d);
	}

	@Override
	public void actualizarDeposito(Deposito d) {
		// TODO Auto-generated method stub
		// Metodo que puede ser util cuando el dueño de la cuenta cambia de nombre o de
		// cuenta
		System.out.println("Se actualizo la informacion del deposito " + d);
	}

	@Override
	public Deposito buscar(String numeroCuenta) {
		// TODO Auto-generated method stub
		// Metodo con el que podemos obtener un deposito hecho a alguna cuenta
		Deposito d = new Deposito();
		d.setFecha(LocalDateTime.now());
		d.setMonto(new BigDecimal(25)); // A modo de ejemplo
		d.setNumeroCuenta(numeroCuenta);
		return d;
	}

	@Override
	public void eliminar(Deposito d) {
		// TODO Auto-generated method stub
		// Para eliminar registros de depositos de usuarios que ya no forman parte del banco
		System.out.println("Se elimino el deposito " + d + " de nuestra base de datos.");
	}

	@Override
	public List<Deposito> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Deposito> listaConsultada = new ArrayList<Deposito>();
		
		Deposito depo1 = new Deposito();
		depo1.setFecha(LocalDateTime.of(2021, 2, 10, 8, 50, 2));
		depo1.setMonto(new BigDecimal(20));
		depo1.setNumeroCuenta(cuenta);
		
		Deposito depo2 = new Deposito();
		depo2.setFecha(LocalDateTime.of(2021, 3, 15, 9, 53, 2));
		depo2.setMonto(new BigDecimal(50));
		depo2.setNumeroCuenta(cuenta);
		
		listaConsultada.add(depo1);
		listaConsultada.add(depo2);
		
		return listaConsultada;
	}

}
