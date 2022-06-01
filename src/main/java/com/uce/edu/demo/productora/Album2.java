package com.uce.edu.demo.productora;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

@Service
public class Album2 { // DI por Constructor
	
	private String nombre;

	private Cancion cancion;
	private Artista artista;

	public Album2(Cancion cancion, Artista artista) {
		this.cancion = cancion;
		this.artista = artista;
	}

	public String registrarCancion(String nombreAlbum, String nombreCancion, String autorCancion,
			LocalDateTime fechaCancion, String nombreArtista, Integer numIntegrante) {
		this.nombre = nombreAlbum;

		this.cancion.setNombre(nombreCancion);
		this.cancion.setAutor(autorCancion);
		this.cancion.setFechaLanzamiento(fechaCancion);

		this.artista.setNombre(nombreArtista);
		this.artista.setNumIntegrante(numIntegrante);

		return "Cancion " + this.cancion.getNombre() + " registrada en el album " + this.nombre
				+ ".\n2) DI por Constructor";
	}

	// GET & SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Cancion getCancion() {
		return cancion;
	}

	public void setCancion(Cancion cancion) {
		this.cancion = cancion;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

}
