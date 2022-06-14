package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;

public class CuentaBancaria {

	private String numero;
	private BigDecimal saldo;
	private String tipo;

	@Override
	public String toString() {
		return "CuentaBancaria [numero=" + numero + ", saldo=" + saldo + ", tipo=" + tipo + "]";
	}

	// GET & SET
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
