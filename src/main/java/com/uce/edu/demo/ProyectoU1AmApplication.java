package com.uce.edu.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.service.IFachadaCuentaBancaria;

@SpringBootApplication
public class ProyectoU1AmApplication implements CommandLineRunner {

	@Autowired
	private IFachadaCuentaBancaria bancaria;
	
	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("\n Tarea 9 \n Cuenta de Ahorro Futura");
		
		BigDecimal interes = this.bancaria.calcularInteres("1213");
		
		System.out.println(interes);

	}

}
