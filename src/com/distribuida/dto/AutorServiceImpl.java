package com.distribuida.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

@Service
public class AutorServiceImpl implements AutorService {
	
	
	@Autowired
	
	private AutorDAO autorDAO;
	

	public List<Autor> findAll() {
		// TODO Auto-generated method stub
		return autorDAO.findAll();
	}

	public Autor findOne(int id) {
		// TODO Auto-generated method stub
		return autorDAO.findOne(id);
	}

	public void add(Autor autor) {
		// TODO Auto-generated method stub
		
		autorDAO.add(autor);

	}

	public void up(Autor autor) {
		// TODO Auto-generated method stub
		
		autorDAO.up(autor);

	}

	public void del(int id) {
		// TODO Auto-generated method stub
		
		autorDAO.del(id);

	}

	public List<Autor> findAll(String busqueda) {
		// TODO Auto-generated method stub
		return autorDAO.findAll(busqueda);
	}

}
