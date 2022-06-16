package com.uce.edu.demo.tarea10.modelo;

import java.util.List;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class TiendaVideojuegos {

	private String ruc;
	private String nombre;
	private String nombrePropietario;
	private String apellidoPropietario;

	private List<Videojuego> listaJuegos;

	@Override
	public String toString() {
		return "TiendaVideojuegos [ruc=" + ruc + ", nombre=" + nombre + ", nombrePropietario=" + nombrePropietario
				+ ", apellidoPropietario=" + apellidoPropietario + ", listaJuegos=" + listaJuegos + "]";
	}

	public String getRuc() {
		return ruc;
	}

	public void setRuc(String ruc) {
		this.ruc = ruc;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNombrePropietario() {
		return nombrePropietario;
	}

	public void setNombrePropietario(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	public String getApellidoPropietario() {
		return apellidoPropietario;
	}

	public void setApellidoPropietario(String apellidoPropietario) {
		this.apellidoPropietario = apellidoPropietario;
	}

	public List<Videojuego> getListaJuegos() {
		return listaJuegos;
	}

	public void setListaJuegos(List<Videojuego> listaJuegos) {
		this.listaJuegos = listaJuegos;
	}

}
