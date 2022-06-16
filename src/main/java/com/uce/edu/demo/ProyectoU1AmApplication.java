package com.uce.edu.demo;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.tarea10.modelo.TiendaVideojuegos;
import com.uce.edu.demo.tarea10.modelo.Videojuego;

@SpringBootApplication
public class ProyectoU1AmApplication implements CommandLineRunner {

	@Autowired
	private TiendaVideojuegos store1;

	@Autowired
	private TiendaVideojuegos store2;

	@Autowired
	private Videojuego game1;

	@Autowired
	private Videojuego game2;

	@Autowired
	private Videojuego game3;

	@Autowired
	private Videojuego game4;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// Singleton
		System.out.println("\n  Singleton:");

		this.store1.setRuc("121212");
		this.store1.setNombre("Tierra del Gaming");
		this.store1.setNombrePropietario("Ariel");
		this.store1.setApellidoPropietario("Maldonado");

		System.out.println("Tienda 1:\n" + this.store1);
		System.out.println("Tienda 2:\n" + this.store2);

		this.store2.setNombre("Gaming Land");

		System.out.println("Tienda 1:\n" + this.store1);
		System.out.println("Tienda 2:\n" + this.store2);

		// Prototype
		System.out.println("\n  Prototype:");

		this.game1.setNombre("God of War");
		this.game1.setDesarrollador("Santa Monica Studio");
		this.game1.setFechaLanzamiento(LocalDateTime.of(2018, 4, 20, 10, 0));

		System.out.println("Juego 1:\n" + this.game1);
		System.out.println("Juego 2:\n" + this.game2);

		this.game2.setNombre("Days Gone");
		this.game2.setDesarrollador("SIE Bend Studio");
		this.game2.setFechaLanzamiento(LocalDateTime.of(2019, 4, 26, 16, 0));

		this.game3.setNombre("Spiderman PS4");
		this.game3.setDesarrollador("Insomniac Games");
		this.game3.setFechaLanzamiento(LocalDateTime.of(2018, 9, 7, 9, 0));

		this.game4.setNombre("Horizon Forbidden West");
		this.game4.setDesarrollador("Guerrilla Games");
		this.game4.setFechaLanzamiento(LocalDateTime.of(2022, 2, 18, 5, 0));

		System.out.println("\nDespues de hacer los set en todos los juegos cada bean tiene sus propios atributos:");
		System.out.println("Juego 1:\n" + this.game1);
		System.out.println("Juego 2:\n" + this.game2);
		System.out.println("Juego 3:\n" + this.game3);
		System.out.println("Juego 4:\n" + this.game4);

		List<Videojuego> lista = new ArrayList<Videojuego>();
		lista.add(game1);
		lista.add(game2);
		lista.add(game3);
		lista.add(game4);

		this.store2.setListaJuegos(lista);

		System.out.println("\nEn ambas tiendas se añadira la lista de los 4 videojuegos: ");
		System.out.println("Tienda 1:\n" + this.store1);
		System.out.println("Tienda 2:\n" + this.store2);

	}

}
