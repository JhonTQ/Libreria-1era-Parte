package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.ClienteService;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteService clienteService =context.getBean("clienteServiceImpl", ClienteService.class);
		
		
		//add
		Cliente cliente2 =new Cliente(0,"0102030405", "Jefferson2", "Gutierritos2","Quito","0987654321","jgutierritos@correo.com");
		
		//clienteService.add(cliente2);
		
		Cliente cliente3 =new Cliente(42,"0102032233", "Pamela", "Gutierritos","Quito","0987651234","pgutierritos@correo.com");
		//clienteService.up(cliente3);
		
		//clienteService.del(42);
		
		
		//FindAll
		
		List<Cliente> clientes =clienteService.findAll();
		
		for (Cliente item : clientes) {
			
			System.out.println(item.toString());
		}
		
		//findOne
		
		//Cliente cliente = clienteService.findOne(1);
		
		//System.out.println(cliente.toString());
		
		context .close();

	}
	
}
