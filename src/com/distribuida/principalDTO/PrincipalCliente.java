package com.distribuida.principalDTO;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.ClienteService;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteService clienteService=context.getBean("clienteServiceImpl", ClienteService.class);
		
		//CRUD
		
		//ADD
		
		clienteService.add(0, "cedula1", "nombre1", "apellido1", "direccion1", "telefono1", "correo1");
		System.out.println(">>>>ADD>>>>>>" + clienteService.findOne(50));
		
		//////////UP
		
	
		clienteService.up(50, "cedula1", "nombre1", "apellido1", "direccion1", "telefono1", "correo1");
		System.out.println(">>>>UP>>>>>>" + clienteService.findOne(50));
		
		//////////////DEL
		
		clienteService.del(50);
		try {
			System.out.println(">>>>DEL>>>>>"+clienteService.findOne(50));}catch(Exception e) {e.printStackTrace();}
		
		for (Cliente item : clienteService.findAll()) {System.out.println(item.toString());	}
		
		context.close();

	}
	
}
