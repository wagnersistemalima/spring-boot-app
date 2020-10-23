package com.sistemalima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemalima.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
