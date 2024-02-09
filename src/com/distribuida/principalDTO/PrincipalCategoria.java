package com.distribuida.principalDTO;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.CategoriaService;
import com.distribuida.entities.Categoria;

public class PrincipalCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CategoriaService categoriaService=context.getBean("categoriaServiceImpl", CategoriaService.class);
		
		//CRUD
		
		//ADD
		
		categoriaService.add(0, "DESCRIP", "CATEG");
		System.out.println(">>>>ADD>>>>>>" + categoriaService.findOne(119));
		
		//////////UP
		
	
		categoriaService.up(119, "DESCRIP2", "CATEG2");
		System.out.println(">>>>UP>>>>>>" + categoriaService.findOne(119));
		
		//////////////DEL
		
		categoriaService.del(119);
		try {
			System.out.println(">>>>DEL>>>>>"+categoriaService.findOne(119));}catch(Exception e) {e.printStackTrace();}
		
		for (Categoria item : categoriaService.findAll()) {System.out.println(item.toString());	}
		
		context.close();

	}
	
}
