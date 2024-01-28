package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;

@Service
public class CategoriaServiceImpl implements CategoriaService {
	
	@Autowired
	
	private CategoriaDAO categoriaDAO;

	public List<Categoria> findAll() {
		// TODO Auto-generated method stub
		return categoriaDAO.findAll();
	}

	public Categoria findOne(int id) {
		// TODO Auto-generated method stub
		return categoriaDAO.findOne(id);
	}

	public void add(Categoria categoria) {
		// TODO Auto-generated method stub
		
		categoriaDAO.add(categoria);

	}

	public void up(Categoria categoria) {
		// TODO Auto-generated method stub
		
		categoriaDAO.up(categoria);

	}

	public void del(int id) {
		// TODO Auto-generated method stub
		categoriaDAO.del(id);
		

	}

	public List<Categoria> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return categoriaDAO.findAll(busqueda);
	}

}
