package com.distribuida.principal;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.CategoriaDAO;
import com.distribuida.entities.Categoria;

public class PrincipalCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CategoriaDAO categoriaDAO=context.getBean("categoriaDAOimpl", CategoriaDAO.class);
		
		//CRUD
		
		//ADD
		Categoria categoria = new Categoria (0, "categoria2", "descripcion 2");
		//categoriaDAO.add(categoria);
		
		//////////UP
		
		Categoria categoria2 = new Categoria (0, "categoria 4", "descripcion 4");
		categoriaDAO.up(categoria2);
		
		
		//////////////DEL
		
		//categoriaDAO.del(55);
		
		
		//findAll
			
		List<Categoria> categoriaes = categoriaDAO.findAll();
		
		for (Categoria item : categoriaes) {
			System.out.println(item.toString());
		}
		
			
		///////findOne
		
		//Categoria Categoria = CategoriaDAO.findOne(1);
		//System.out.println(Categoria.toString());
		
		
		/*List<Categoria> Categoriaes2 = CategoriaDAO.findAll("pam");
		for(Categoria Categoria3: Categoriaes2) {
			System.out.println(Categoria3.toString());	
		}*/
		
		context.close();

	}
	
}
