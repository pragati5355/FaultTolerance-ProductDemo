package com.productdemo.persistance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.productdemo.persistance.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{

}
