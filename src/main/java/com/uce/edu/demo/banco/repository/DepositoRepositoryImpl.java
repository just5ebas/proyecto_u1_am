package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

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

}
