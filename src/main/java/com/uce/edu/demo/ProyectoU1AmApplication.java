package com.uce.edu.demo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.productora.Album1;
import com.uce.edu.demo.productora.Album2;
import com.uce.edu.demo.productora.Album3;

@SpringBootApplication
public class ProyectoU1AmApplication implements CommandLineRunner {

	// DI por atributo
//	@Autowired
//	private CitaMedica cita;

	// DI por SET
//	@Autowired
//	private CitaMedica2 cita;

	// ***************************************************************************
	// Tarea 5:

	// 1) DI por Atributos
	@Autowired
	private Album1 album1;

	// 2) DI por Atributos
	@Autowired
	private Album2 album2;

	// 3) DI por metodos SET
	@Autowired
	private Album3 album3;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AmApplication.class, args);
	}

//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		System.out.println("Mi primer proyecto con Spring Framework.");
//
//		String respuesta = cita.agendar(LocalDateTime.now(), "Javier", "Terán", 32, "Quito", "Pepito", 19);
//		System.out.println(respuesta);
//	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\n ###### Disquera Music-Mania ###### ");

		// 1) DI por Atributos
		String respuesta1 = album1.registrarCancion("Harry's House", "As it was", "Harry Styles",
				LocalDateTime.of(2022, 5, 21, 12, 30), "Harry Styles", 1);

		// 2) DI por Constructor
		String respuesta2 = album2.registrarCancion("The Rumbling - Single", "The Rumbling", "MAH",
				LocalDateTime.of(2022, 2, 7, 0, 0), "SiM", 4);

		// 3) DI por metodos SET
		String respuesta3 = album3.registrarCancion("Simulation Theory", "The Dark Side", "Matt Bellamy",
				LocalDateTime.of(2018, 9, 1, 8, 0), "Muse", 3);

		System.out.println("\n" + respuesta1);
		System.out.println("\n" + respuesta2);
		System.out.println("\n" + respuesta3);
	}

}
