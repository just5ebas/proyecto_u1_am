package com.uce.edu.demo.productora;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class Cancion {

	private String nombre;
	private String autor;
	private LocalDateTime fechaLanzamiento;

	// GET & SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public LocalDateTime getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(LocalDateTime fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

}
