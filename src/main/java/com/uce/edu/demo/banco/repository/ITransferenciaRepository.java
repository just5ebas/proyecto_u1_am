package com.uce.edu.demo.banco.repository;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaRepository {

	public void insertar(Transferencia t);

	public void actualizar(Transferencia t);

	public Transferencia buscar(String numeroCtaOrigen);

	public void eliminar(Transferencia t);

}
