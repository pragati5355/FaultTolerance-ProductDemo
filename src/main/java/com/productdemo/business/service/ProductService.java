package com.productdemo.business.service;

import java.util.List;

import com.productdemo.persistance.entity.Product;

public interface ProductService {
	
	public Product getOneProduct(Integer id);
	
	public List<Product> getAllProducts();

}
