package com.uce.edu.demo.tarea10.modelo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Videojuego {

	private String nombre;
	private String desarrollador;
	private LocalDateTime fechaLanzamiento;

	@Override
	public String toString() {
		return "Videojuego [nombre=" + nombre + ", desarrollador=" + desarrollador + ", fechaLanzamiento="
				+ fechaLanzamiento + "]";
	}
	
	// GET & SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDesarrollador() {
		return desarrollador;
	}

	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
	}

	public LocalDateTime getFechaLanzamiento() {
		return fechaLanzamiento;
	}

	public void setFechaLanzamiento(LocalDateTime fechaLanzamiento) {
		this.fechaLanzamiento = fechaLanzamiento;
	}

}
