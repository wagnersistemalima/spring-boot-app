package com.sistemalima.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemalima.course.entities.User;
import com.sistemalima.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {                                            // controlador Rest
	
	// dependência
	
	@Autowired
	private UserService service;
	
	// 1º end point / buscar todos / Get   - retorna uma resposta (200) com suscesso
	
	@GetMapping
	public ResponseEntity <List<User>> findAll() {                 
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);                      
	}
	
	// 2º end point / buscar por id / Get  - retorna uma resposta 200 com sucesso
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);		
	}

}
