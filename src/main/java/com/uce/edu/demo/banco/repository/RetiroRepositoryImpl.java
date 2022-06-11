package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Retiro;

@Repository
public class RetiroRepositoryImpl implements IRetiroRepository {

	@Override
	public void insertar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se inserto en la base el retiro " + r);
	}

	@Override
	public void actualizar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se actualizo en la base el retiro " + r);
	}

	@Override
	public Retiro buscar(String numeroCuenta) {
		// TODO Auto-generated method stub
		Retiro r = new Retiro();
		r.setFechaRetiro(LocalDateTime.now());
		r.setMonto(new BigDecimal(35));
		r.setNumeroCuenta(numeroCuenta);
		return r;
	}

	@Override
	public void eliminar(Retiro r) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino de la base el retiro " + r);
	}

	@Override
	public List<Retiro> consultar(String cuenta, LocalDateTime fechaInicio, LocalDateTime fechaFin) {
		// TODO Auto-generated method stub
		List<Retiro> listaRetiro = new ArrayList<Retiro>();

		Retiro ret1 = new Retiro();
		ret1.setFechaRetiro(LocalDateTime.of(2022, 12, 20, 13, 34, 10));
		ret1.setMonto(new BigDecimal(25));
		ret1.setNumeroCuenta(cuenta);

		listaRetiro.add(ret1);

		return listaRetiro;
	}

}
