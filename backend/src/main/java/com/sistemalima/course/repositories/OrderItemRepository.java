package com.sistemalima.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sistemalima.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
