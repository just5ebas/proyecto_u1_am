package com.uce.edu.demo.banco.service;

import java.math.BigDecimal;

import com.uce.edu.demo.banco.modelo.Transferencia;

public interface ITransferenciaService {

	public void realizar(String ctaOrigen, String ctaDestino, BigDecimal monto);

	public void actualizarInformacion(Transferencia t);

	public Transferencia buscarRegistro(String numeroCtaOrigen);

	public void eliminarRegistro(Transferencia t);

}
