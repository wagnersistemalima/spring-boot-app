package com.sistemalima.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemalima.course.entities.Product;
import com.sistemalima.course.repositories.ProductRepository;

// regras de negocio

@Service
public class ProductService {
	
	// dependencia para o repository
	
	@Autowired
	private ProductRepository repository;
	
	// metodo buscar todos
	
	public List<Product> findAll() {
		return repository.findAll();
	}
	
	// metodo buscar por id
	
	public Product findBayId(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
