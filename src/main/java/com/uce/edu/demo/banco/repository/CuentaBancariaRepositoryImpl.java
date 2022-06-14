package com.uce.edu.demo.banco.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.banco.modelo.CuentaBancaria;

@Repository
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	@Override
	public void insertar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		// Metodo que puede servir para abrir cuentas
		System.out.println("Se ha registrado la cuenta " + c + " en la base de datos.");
	}

	@Override
	public void actualizar(CuentaBancaria c) {
		// Aqui hay que construir los SQL's
		System.out.println("Cuenta bancaria actualizada a: " + c);
	}

	@Override
	public CuentaBancaria buscar(String numero) {
		// TODO Auto-generated method stub
		System.out.println("Se busca la cuenta bancaria: " + numero);
		CuentaBancaria cta = new CuentaBancaria();
		cta.setNumero(numero);
		cta.setSaldo(new BigDecimal(100));
		cta.setTipo("A_F");
		return cta;
	}

	@Override
	public void eliminar(CuentaBancaria c) {
		// TODO Auto-generated method stub
		// Metodo que puede ser usado para cerrar cuentas
		System.out.println("Se ha eliminado la cuenta " + c + " de la base de datos.");
	}

}
