package com.sistemalima.course.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemalima.course.entities.Order;
import com.sistemalima.course.repositories.OrderRepository;

// regras de negocio

@Service
public class OrderService {
	
	// dependencia para o repository
	
	@Autowired
	private OrderRepository repository;
	
	// metodo buscar todos 
	
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	// metodo buscar por id
	
	public Order findById(Long id) {
		Optional <Order> obj = repository.findById(id);
		return obj.get();
	}
	
	

}
