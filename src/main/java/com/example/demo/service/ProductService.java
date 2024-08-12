package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;

	public String addProduct(Product product) {
		if(productRepository.existsById(product.getProductId())) {
			return "Product is already registered in the Database";
		}
		productRepository.save(product);
		return "Product Add Successfully";
	}
	
	

}
