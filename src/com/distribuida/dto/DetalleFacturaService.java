package com.distribuida.dto;

import java.util.List;

import com.distribuida.entities.DetalleFactura;

public interface DetalleFacturaService {
	
	public List<DetalleFactura> findAll();

	public DetalleFactura findOne (int id);
	
	public void add(DetalleFactura factura);
	
	public void up(DetalleFactura factura);
	
	public void del(int id);
	
	public List<DetalleFactura> findAll(String busqueda);

}
