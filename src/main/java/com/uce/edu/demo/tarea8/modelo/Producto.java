package com.uce.edu.demo.tarea8.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Producto implements Comparable<LocalDateTime> {

	private String nombre;
	private Integer cantidad;
	private BigDecimal precioCompra;
	private BigDecimal precioVenta;
	private LocalDateTime fechaIngreso;

	@Override
	public String toString() {
		return "[" + nombre + "]";
	}

	@Override
	public int compareTo(LocalDateTime o) {
		// TODO Auto-generated method stub
		return this.fechaIngreso.compareTo(o);
	}

	// GET & SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioCompra() {
		return precioCompra;
	}

	public void setPrecioCompra(BigDecimal precioCompra) {
		this.precioCompra = precioCompra;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public LocalDateTime getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(LocalDateTime fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

}
