package com.sistemalima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemalima.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
