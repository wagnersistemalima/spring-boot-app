package com.sistemalima.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemalima.course.entities.Product;
import com.sistemalima.course.services.ProductService;

// controlador Rest

@RestController
@RequestMapping(value = "/products")
public class ProductResource {
	
	// dependencia para o service
	
	@Autowired
	private ProductService service;
	
	// 1º end point / buscar todos / retorna uma resposta (200) com suscesso
	
	@GetMapping
	public ResponseEntity <List<Product>> findAll() {
		List<Product> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	// 2º end point / buscar por id / retorna uma resposta (200) com suscesso
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) {
		Product obj = service.findBayId(id);
		return ResponseEntity.ok().body(obj);
	}

}
