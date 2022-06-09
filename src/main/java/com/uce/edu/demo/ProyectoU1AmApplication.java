package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.banco.modelo.Deposito;
import com.uce.edu.demo.banco.modelo.Retiro;
import com.uce.edu.demo.banco.modelo.Transferencia;
import com.uce.edu.demo.banco.service.IDepositoService;
import com.uce.edu.demo.banco.service.IRetiroService;
import com.uce.edu.demo.banco.service.ITransferenciaService;

@SpringBootApplication
public class ProyectoU1AmApplication implements CommandLineRunner {

	@Autowired
	private ITransferenciaService transferenciaService;

	@Autowired
	private IDepositoService depositoService;

	@Autowired
	private IRetiroService retiroService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1AmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("\nTarea 7: Componentes de Negocio\n");
		
		System.out.println("\nTransferencias:\n");
		// Transferencia
		// Insertar
		this.transferenciaService.realizar("12", "13", new BigDecimal(20));
		// Buscar
		Transferencia t = this.transferenciaService.buscarRegistro("12");
		// Actualizar
		t.setNumeroCuentaOrigen("19");
		this.transferenciaService.actualizarInformacion(t);
		// Eliminar
		t.setFechaTransferencia(LocalDateTime.of(2022, 5, 1, 0, 0));
		this.transferenciaService.eliminarRegistro(t);

		System.out.println("\nDepositos:\n");

		// Deposito
		// Insertar
		this.depositoService.realizar("14", new BigDecimal(50));
		// Buscar
		Deposito d = this.depositoService.buscarRegistro("14");
		// Actualizar
		d.setNumeroCuenta("16");
		this.depositoService.actualizarInformacion(d);
		// Eliminar
		d.setFecha(LocalDateTime.of(2021, 12, 14, 15, 20));
		this.depositoService.eliminarRegistro(d);

		System.out.println("\nRetiros:\n");

		// Retiro
		// Insertar
		this.retiroService.retirar("20", new BigDecimal(15));
		// Buscar
		Retiro r = this.retiroService.buscarRegistro("20");
		// Actualizar
		r.setFechaRetiro(LocalDateTime.of(2022, 2, 14, 15, 26));
		this.retiroService.actualizarInformacion(r);
		// Eliminar
		r.setNumeroCuenta("18");
		this.retiroService.eliminarRegistro(r);

	}

}
