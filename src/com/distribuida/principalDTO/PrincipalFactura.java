package com.distribuida.principalDTO;
import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.FacturaService;
import com.distribuida.entities.Factura;

public class PrincipalFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturaService facturaService=context.getBean("facturaServiceImpl", FacturaService.class);
		
		//CRUD
		
		//ADD
		
		facturaService.add(0, "NF1", new Date(), 20.20, 0.12, 23.12, 1);
		System.out.println(">>>>ADD>>>>>>" + facturaService.findOne(106));
		
		//////////UP
		
	
		facturaService.up(106, "NF1", new Date(), 20.20, 0.12, 23.12, 1);
		System.out.println(">>>>UP>>>>>>" + facturaService.findOne(106));
		
		//////////////DEL
		
		facturaService.del(106);
		try {
			System.out.println(">>>>DEL>>>>>"+facturaService.findOne(106));}catch(Exception e) {e.printStackTrace();}
		
		for (Factura item : facturaService.findAll()) {System.out.println(item.toString());	}
		
		context.close();

	}
	
}
