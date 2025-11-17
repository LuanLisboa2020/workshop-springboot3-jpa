package com.Lisboa.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Lisboa.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
