package com.productdemo.persistance.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Repository;

import com.productdemo.business.constant.ExceptionMessage;
import com.productdemo.business.exception.CustomException;
import com.productdemo.persistance.entity.Product;
import com.productdemo.persistance.repository.ProductRepository;


@Repository
public class ProductDaoImpl implements ProductDao{
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private Environment environment;
	
	@Override
	public Product getOneProduct(Integer id) {
		return productRepository.findById(id)
				.orElseThrow( () -> new CustomException(environment.getProperty(ExceptionMessage.PRODUCT_NOT_FOUND), HttpStatus.NOT_FOUND));
	}

	
	@Override
	public List<Product> getALLProduct() {
		
		try {
			return productRepository.findAll();
		}
		catch(Exception e) {
			throw new CustomException(e.getMessage(), HttpStatus.NOT_FOUND);
		}
	}

}
