package com.distribuida.entities;

import java.util.Date;

public class DetalleFactura {
	
	private int idaDetalleFactura;
	private int cantidad;
	private Double subTotal;
		
	private Factura factura;
	
	private Libro libro;
	
	public DetalleFactura (){}

	public int getIdaDetalleFactura() {
		return idaDetalleFactura;
	}

	public void setIdaDetalleFactura(int idaDetalleFactura) {
		this.idaDetalleFactura = idaDetalleFactura;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(Double subTotal) {
		this.subTotal = subTotal;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public String toString() {
		return "DetalleFactura [idaDetalleFactura=" + idaDetalleFactura + ", cantidad=" + cantidad + ", subTotal="
				+ subTotal + ", factura=" + factura + ", libro=" + libro + "]";
	}
	
	
	

}
