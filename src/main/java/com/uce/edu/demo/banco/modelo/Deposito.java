package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Deposito {

	private LocalDateTime fecha;
	private String numeroCuenta;
	private BigDecimal monto;

	@Override
	public String toString() {
		return "Deposito [fecha=" + fecha + ", numeroCuenta=" + numeroCuenta + ", monto=" + monto + "]";
	}

	// GET & SET
	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

}
