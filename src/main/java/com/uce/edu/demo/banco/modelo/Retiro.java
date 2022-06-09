package com.uce.edu.demo.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Retiro {

	private String numeroCuenta;
	private BigDecimal monto;
	private LocalDateTime fechaRetiro;

	@Override
	public String toString() {
		return "Retiro [numeroCuenta=" + numeroCuenta + ", monto=" + monto + ", fechaRetiro=" + fechaRetiro + "]";
	}

	// GET & SET
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

	public LocalDateTime getFechaRetiro() {
		return fechaRetiro;
	}

	public void setFechaRetiro(LocalDateTime fechaRetiro) {
		this.fechaRetiro = fechaRetiro;
	}

}
