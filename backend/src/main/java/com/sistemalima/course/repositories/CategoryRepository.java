package com.sistemalima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemalima.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
