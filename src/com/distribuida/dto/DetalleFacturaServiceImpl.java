package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.DetalleFacturaDAO;
import com.distribuida.entities.DetalleFactura;
@Service
public class DetalleFacturaServiceImpl implements DetalleFacturaService {
	
	@Autowired
	
	private DetalleFacturaDAO detallefacturaDAO;

	public List<DetalleFactura> findAll() {
		// TODO Auto-generated method stub
		return detallefacturaDAO.findAll();
	}

	public DetalleFactura findOne(int id) {
		// TODO Auto-generated method stub
		return detallefacturaDAO.findOne(id);
	}

	public void add(DetalleFactura factura) {
		// TODO Auto-generated method stub
		
		detallefacturaDAO.add(factura);

	}

	public void up(DetalleFactura factura) {
		// TODO Auto-generated method stub
		
		detallefacturaDAO.up(factura);

	}

	public void del(int id) {
		// TODO Auto-generated method stub
		
		detallefacturaDAO.del(id);

	}

	public List<DetalleFactura> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return detallefacturaDAO.findAll(busqueda);
	}

}
