package com.alexey.inventory_service.repository;

import com.alexey.inventory_service.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

    Page<Product> findByNameContainingIgnoreCase(String name, Pageable pageable);
}
