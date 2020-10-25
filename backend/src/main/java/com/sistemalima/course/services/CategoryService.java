package com.sistemalima.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemalima.course.entities.Category;
import com.sistemalima.course.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	// dependencia
	@Autowired
	private CategoryRepository repository;
	
	// metodos buscar todos
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	// metodo buscar por id
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
