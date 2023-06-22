package com.productdemo.persistance.dao;

import java.util.List;

import com.productdemo.persistance.entity.Product;

public interface ProductDao {
	
	public Product getOneProduct(Integer id);
	
	public List<Product> getALLProduct();

}
