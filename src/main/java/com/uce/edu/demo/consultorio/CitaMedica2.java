package com.uce.edu.demo.consultorio;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitaMedica2 {

	private LocalDateTime fechaCita;
	
	// 3) DI por metodos set
	private Doctor doctor; // 3) definir @Autowired en su metodo set
	private Paciente paciente; // definir @Autowired su el metodo set

	public String agendar(LocalDateTime fechaCita, String nombre, String apellido, Integer edad, String ciudad,
			String nombrePaciente, int edadPaciente) {

		this.doctor.setNombre(nombre);
		this.doctor.setApellido(apellido);
		this.doctor.setEdad(edad);
		this.doctor.setCiudad(ciudad);

		this.paciente.setNombre(nombrePaciente);
		this.paciente.setEdad(edadPaciente);

		// Seteamps los atributos de cita medica
		this.fechaCita = fechaCita;

		// Se inserta la cita en la base de datos
		return "Cita agendada 2.";
	}

	// SET & GET
	public Doctor getDoctor() {
		return doctor;
	}

	@Autowired
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	@Autowired
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public LocalDateTime getFechaCita() {
		return fechaCita;
	}

	public void setFechaCita(LocalDateTime fechaCita) {
		this.fechaCita = fechaCita;
	}

}
