package com.sistemalima.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sistemalima.course.entities.User;
import com.sistemalima.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	
	// metodo buscar todos
	public List<User> findAll() {
		return repository.findAll();
	}
	
	// metodo buscar por id
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}

}
