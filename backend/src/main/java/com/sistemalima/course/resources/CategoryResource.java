package com.sistemalima.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemalima.course.entities.Category;
import com.sistemalima.course.services.CategoryService;

// Controlador Rest

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	// dependencia 
	
	@Autowired
	private CategoryService service;
	
	// 1º end point / buscar todos / retornar uma resposta http 200 com suscesso
	
	@GetMapping
	public ResponseEntity <List<Category>> findAll() {
		List<Category> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	// 2º end point / buscar por id / retornar uma resposta http 200 com sucesso
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
