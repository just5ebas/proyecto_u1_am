package com.uce.edu.demo.tarea8.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.tarea8.modelo.Inventario;
import com.uce.edu.demo.tarea8.modelo.Producto;

@Service
public class GestorInventarioServiceImpl implements IGestorInventarioService {

	@Autowired
	private IProductoService iProductoService;

	@Autowired
	private IInventarioService iInventarioService;

	@Override
	public void calcularPrecioVenta(Inventario i) {
		// TODO Auto-generated method stub
		List<Producto> lista = i.getListaProductos();

		for (Producto p : lista) {
			BigDecimal g = p.getPrecioCompra().multiply(new BigDecimal(0.1));
			BigDecimal iva = p.getPrecioCompra().multiply(new BigDecimal(0.12));

			p.setPrecioVenta(p.getPrecioCompra().add(g).add(iva));
			this.iProductoService.actualizarInformacion(p);
		}

		i.setListaProductos(lista);

		this.iInventarioService.actualizar(i);
	}

	@Override
	public void ingresarProductosToBodega(Inventario i, Producto... p) {
		// TODO Auto-generated method stub
		this.iInventarioService.insertarProductos(i, p);

		for (Producto prod : p) {
			this.iProductoService.comprarProducto(prod);
		}
	}

	@Override
	public void imprimirInventario(Inventario i, LocalDateTime fechaFiltro) {
		// TODO Auto-generated method stub
		System.out.println("Nombre del producto -- Cantidad -- Precio de Venta -- Fecha de ingreso a bodega\n");

		for (Producto p : i.getListaProductos()) {
			if (p.compareTo(fechaFiltro) >= 0) {
				System.out.printf("%25s",p.getNombre() + " -- ");
				System.out.print(p.getCantidad() + " -- $");
				System.out.printf("%.2f -- ", p.getPrecioVenta().doubleValue());
				System.out.print(p.getFechaIngreso().getYear() + "-");
				System.out.print(p.getFechaIngreso().getMonthValue() + "-");
				System.out.print(p.getFechaIngreso().getDayOfMonth() + " - ");
				System.out.print(p.getFechaIngreso().getHour() + ":");
				System.out.print(p.getFechaIngreso().getMinute() + ":");
				System.out.println(p.getFechaIngreso().getSecond());
			}

		}
	}

}
