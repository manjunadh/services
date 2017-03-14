package com.microservices.product.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.product.dao.ProductRepository;
import com.microservices.product.model.Product;

@Service
public class ProductService {
	@Autowired
	private ProductRepository productRepository;

	public List<Product> getAllProducts() {
		List<Product> products = new ArrayList<>();
		productRepository.findAll().forEach(products::add);
		return products;
	}

	public Product getProductById(String id) {
		return productRepository.findOne(id);
	}

	public List<Product> getProductByName(String name) {
		return productRepository.findByName(name);
	}

	public List<Product> getProductByDescription(String description) {
		return productRepository.findByDescription(description);
	}

}
