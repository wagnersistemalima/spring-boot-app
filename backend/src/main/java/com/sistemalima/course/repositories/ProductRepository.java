package com.sistemalima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemalima.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
