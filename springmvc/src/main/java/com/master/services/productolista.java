package com.master.services;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class productolista {
	
	producto producto1 = new producto();
	producto producto2 = new producto();
	producto producto3 = new producto();
	producto producto4 = new producto();
	List<producto> productos;
	
	
	public List<producto> getListProductos(){
	
	producto1.setCodigo(1);
	producto1.setNombre("manzana");
	producto1.setDescripcion("producto comestible");
	producto1.setPrecio(2);
	
	producto2.setCodigo(2);
	producto2.setNombre("sandia");
	producto2.setDescripcion("producto comestible");
	producto2.setPrecio(1);
	
	producto3.setCodigo(3);
	producto3.setNombre("pera");
	producto3.setDescripcion("producto comestible");
	producto3.setPrecio(5);
	
	producto4.setCodigo(4);
	producto4.setNombre("coca cola");
	producto4.setDescripcion("producto comestible");
	producto4.setPrecio(1);

	return productos = Arrays.asList(producto1, producto2, producto3, producto4);
	
	}

}
