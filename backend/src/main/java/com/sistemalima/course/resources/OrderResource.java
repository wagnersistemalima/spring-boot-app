package com.sistemalima.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemalima.course.entities.Order;
import com.sistemalima.course.services.OrderService;

// controlador rest

@RestController
@RequestMapping(value = "/orders")
public class OrderResource {
	
	// dependência
	
	@Autowired
	private OrderService service;
	
	// 1º end point / buscar todos / Get   - retorna uma resposta 200 com suscesso
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	// 2º end point / buscar por id / Get  - retorna uma resposta 200 com sucesso
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) {
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
