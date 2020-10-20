package com.sistemalima.course.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemalima.course.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {                                            // controlador Rest
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User user1 = new User(1L, "Maria Silva", "maria@gmail.com", "83 93885455", "123");
		return ResponseEntity.ok().body(user1);
	}

}
