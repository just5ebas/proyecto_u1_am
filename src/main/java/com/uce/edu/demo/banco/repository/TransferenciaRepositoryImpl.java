package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

@Repository
public class TransferenciaRepositoryImpl implements ITransferenciaRepository {

	@Override
	public void insertar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Aqui se inserta la transferencia en la base de datos: " + t);
	}

	@Override
	public void actualizar(Transferencia t) {
		// TODO Auto-generated method stub
		// Para actualizar los datos de cualquiera de las cuentas involucradas
		System.out.println("Se actualizo: " + t);
	}

	@Override
	public Transferencia buscar(String numeroCtaOrigen) {
		// TODO Auto-generated method stub
		// Metodo para buscar una transferencia hecha desde una cuenta
		Transferencia t = new Transferencia();
		t.setFechaTransferencia(LocalDateTime.now());
		t.setMontoTransferir(new BigDecimal(21));
		t.setNumeroCuentaDestino("17");
		t.setNumeroCuentaOrigen(numeroCtaOrigen);
		return t;
	}

	@Override
	public void eliminar(Transferencia t) {
		// TODO Auto-generated method stub
		System.out.println("Se elimino: " + t);
	}

}
