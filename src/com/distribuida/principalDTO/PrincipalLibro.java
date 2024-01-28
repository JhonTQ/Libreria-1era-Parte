package com.distribuida.principalDTO;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dto.AutorService;
import com.distribuida.dto.CategoriaService;
import com.distribuida.dto.LibroService;
import com.distribuida.entities.Autor;
import com.distribuida.entities.Categoria;
import com.distribuida.entities.Libro;


public class PrincipalLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		LibroService libroService =context.getBean("libroServiceImpl", LibroService.class);
		CategoriaService categoriaService =context.getBean("categoriaServiceImpl", CategoriaService.class);
		AutorService autorService =context.getBean("autorServiceImpl", AutorService.class);
		
		//CRU
		
				//ADD
				Categoria categoria =categoriaService.findOne(1);
				Autor autor =autorService.findOne(1);
				Libro libro = new Libro (0,"Pinocho","niles",200,"2th","español",new Date(),"ficcion","pasra blanda","768-123456789","5","portada","fisica", 22.22,categoria,autor);
				//libroService.add(libro);
				
		/////////UP
				
				Categoria categoria2 =categoriaService.findOne(2);
				Autor autores2 =autorService.findOne(2);
				Libro libro2 = new Libro (82,"geni","tales",200,"2th","español",new Date(),"cuento","pasta blanda","768-123456789","5","portada","infantil", 40.22,categoria2,autores2);
				libroService.up(libro2);
				
				//BORRADO
				//libroService.del(80);
				
				
				//FindAll
				List<Libro> libros =libroService.findAll();
				
				for (Libro item : libros) {
					
					System.out.println(item);
				}
				
				
				// findOne
				
						//Libro libro1 = libroService.findOne(1);
						//System.out.println(libro1.toString());
				context.close();
				
				

	}

}
