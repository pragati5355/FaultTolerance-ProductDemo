package com.productdemo.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productdemo.business.service.ProductService;
import com.productdemo.web.model.ResponseModel;

@RestController
@RequestMapping()
public class ProductController extends BaseController{
	

	@Autowired
	private ProductService productService;
	
	@GetMapping("/home")
	public String home() {
		return "This is a Home of Product Server";
	}
	
	@GetMapping("/product/{id}")
	public ResponseEntity<ResponseModel>  getProduct(@PathVariable Integer id)  {
		ResponseModel response = ResponseModel.getInstance();
		response.setData(productService.getOneProduct(id));
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	
	@GetMapping("/product/list")
	public ResponseEntity<ResponseModel>  getAllProduct()  {
		ResponseModel response = ResponseModel.getInstance();
		response.setData(productService.getAllProducts());
		return new ResponseEntity<>(response, HttpStatus.OK);
	}

}
