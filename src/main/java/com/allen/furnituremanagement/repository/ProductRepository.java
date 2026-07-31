package com.allen.furnituremanagement.repository;

import com.allen.furnituremanagement.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}