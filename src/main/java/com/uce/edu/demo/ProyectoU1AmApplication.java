package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.tarea8.modelo.Inventario;
import com.uce.edu.demo.tarea8.modelo.Producto;
import com.uce.edu.demo.tarea8.service.IGestorInventarioService;

@SpringBootApplication
public class ProyectoU1AmApplication implements CommandLineRunner {

	@Autowired
	private IGestorInventarioService gestorInventarioService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.println("\n            MEGA SANTA MARIA\n");

		Inventario i = new Inventario();
		i.setId("Inv000");

		Producto p1 = new Producto();
		p1.setNombre("Coca Cola 3L");
		p1.setCantidad(250);
		p1.setPrecioCompra(new BigDecimal(3.5));
		p1.setFechaIngreso(LocalDateTime.of(2021, 12, 26, 12, 0, 5));

		Producto p2 = new Producto();
		p2.setNombre("Pilsener 6-Pack");
		p2.setCantidad(400);
		p2.setPrecioCompra(new BigDecimal(8));
		p2.setFechaIngreso(LocalDateTime.of(2022, 4, 10, 14, 35, 32));

		Producto p3 = new Producto();
		p3.setNombre("Combo Snacks Familiar");
		p3.setCantidad(900);
		p3.setPrecioCompra(new BigDecimal(10.78));
		p3.setFechaIngreso(LocalDateTime.of(2021, 10, 22, 15, 30, 21));

		Producto p4 = new Producto();
		p4.setNombre("Pollo Entero");
		p4.setCantidad(500);
		p4.setPrecioCompra(new BigDecimal(7.25));
		p4.setFechaIngreso(LocalDateTime.of(2022, 5, 25, 8, 40, 20));

		Producto p5 = new Producto();
		p5.setNombre("Combo Carnes");
		p5.setCantidad(350);
		p5.setPrecioCompra(new BigDecimal(15.55));
		p5.setFechaIngreso(LocalDateTime.of(2022, 6, 1, 10, 48, 55));
		
		System.out.println("\nIngreso a base de datos\n");

		this.gestorInventarioService.ingresarProductosToBodega(i, p1, p2, p3, p4, p5);
		
		System.out.println("\nActualizacion de los datos - Calculo del precio de venta\n");
		
		this.gestorInventarioService.calcularPrecioVenta(i);
		
		System.out.println("\n   Inventario: \n");
		
		// se mostraran solo los productos que fueron ingresados a partir del 01 de enero del 2022 a las 00:00
//		this.gestorInventarioService.imprimirInventario(i, LocalDateTime.of(2022, 1, 1, 0, 0));
		
		// se mostraran solo los productos que fueron ingresados a partir del 01 de enero del 2018 a las 00:00
		this.gestorInventarioService.imprimirInventario(i, LocalDateTime.of(2018, 1, 1, 0, 0));

	}

}
