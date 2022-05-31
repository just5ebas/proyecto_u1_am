package com.uce.edu.demo.productora;

import org.springframework.stereotype.Component;

@Component
public class Artista {

	private String nombre; // Puede ser una persona o una banda
	private Integer numIntegrante; // guarda el numero de integrantes que conforman esta banda

	// GET & SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getNumIntegrante() {
		return numIntegrante;
	}

	public void setNumIntegrante(Integer numIntegrante) {
		this.numIntegrante = numIntegrante;
	}

}
