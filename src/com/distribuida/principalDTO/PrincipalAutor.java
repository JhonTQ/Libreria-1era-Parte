package com.distribuida.principalDTO;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.AutorService;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;

public class PrincipalAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorService autorService=context.getBean("autorServiceImpl", AutorService.class);
		
		//CRUD
		
		//ADD
		
		autorService.add(0, "D", "M", "Ecuad", "Tumbaco", "telefono1", "correo1");
		System.out.println(">>>>ADD>>>>>>" + autorService.findOne(71));
		
		//////////UP
		
	
		autorService.up(71, "nombre8", "apellido8", "pais8", "direccion2", "telefono2", "correo2");
		System.out.println(">>>>UP>>>>>>" + autorService.findOne(71));
		
		//////////////DEL
		
		autorService.del(71);
		try {
			System.out.println(">>>>DEL>>>>>"+autorService.findOne(71));}catch(Exception e) {e.printStackTrace();}
		
		for (Autor item : autorService.findAll()) {System.out.println(item.toString());	}
		
		context.close();

	}
	
}
