package com.distribuida.principalDTO;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dto.DetalleFacturaService;
import com.distribuida.entities.DetalleFactura;

public class PrincipalDetalleFactura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context =new ClassPathXmlApplicationContext("ApplicationContext.xml");
		DetalleFacturaService detallefacturaService =context.getBean("detallafacturaServiceImpl", DetalleFacturaService.class);
		//CRUD
		//ADD
		detallefacturaService.add(0, 2, 20.20, 1, 1);
		System.out.println(">>>>ADD>>>>>>" + detallefacturaService.findOne(208));
		
		//////////UP
		
	
		detallefacturaService.up(208, 2, 20.20, 1, 1);
		System.out.println(">>>>UP>>>>>>" + detallefacturaService.findOne(208));
		
		//////////////DEL
		
		detallefacturaService.del(208);
		try {
			System.out.println(">>>>DEL>>>>>"+detallefacturaService.findOne(208));}catch(Exception e) {e.printStackTrace();}
		
		for (DetalleFactura item : detallefacturaService.findAll()) {System.out.println(item.toString());	}
		
		context.close();

	}
	
}
