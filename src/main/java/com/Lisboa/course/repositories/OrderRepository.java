package com.Lisboa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lisboa.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
