package com.distribuida.principalDTO;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.LibroService;
import com.distribuida.entities.Libro;


public class PrincipalLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		LibroService libroService=context.getBean("libroServiceImpl", LibroService.class);
		
		//CRUD
		
		//ADD
		
		libroService.add(0, "t", "e", 2, "E", "T", new Date(),"te", "co","IBSN","3", "po", "pre",12.12,1,1);
		System.out.println(">>>>ADD>>>>>>" + libroService.findOne(94));
		
		//////////UP
		
	
		libroService.up(94, "t", "e", 2, "E", "T", new Date(),"te", "co","IBSN","3", "po", "pre",12.12,1,1);
		System.out.println(">>>>UP>>>>>>" + libroService.findOne(94));
		
		//////////////DEL
		
		libroService.del(94);
		try {
			System.out.println(">>>>DEL>>>>>"+libroService.findOne(94));}catch(Exception e) {e.printStackTrace();}
		
		for (Libro item : libroService.findAll()) {System.out.println(item.toString());	}
		
		context.close();

	}
	
}
