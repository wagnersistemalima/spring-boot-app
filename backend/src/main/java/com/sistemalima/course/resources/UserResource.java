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
	
	@Autowired
	private UserService service;
	
	@GetMapping
	public ResponseEntity <List<User>> findAll() {                 // 1º end point buscar todos
		List<User> list = service.findAll();
		return ResponseEntity.ok().body(list);                      // retornar uma resposta 200 com sucesso
	}
	
	// metodo buscar por id
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id) {
		User obj = service.findById(id);
		return ResponseEntity.ok().body(obj);		
	}

}
