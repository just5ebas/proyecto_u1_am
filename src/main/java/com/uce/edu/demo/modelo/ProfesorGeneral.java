package com.uce.edu.demo.modelo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProfesorGeneral { // Singleton

	private String nombre;
	private String apellido;

	@Override
	public String toString() {
		return "ProfesorGeneral [nombre=" + nombre + ", apellido=" + apellido + "]";
	}

	// GET & SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
