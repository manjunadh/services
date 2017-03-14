package com.microservices.product.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.product.model.Product;
import com.microservices.product.services.ProductService;

@RestController
public class ProductController {
	@Autowired
	private ProductService productService;

	@RequestMapping("/products")
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}

	@RequestMapping("/Products/{id}")
	public Product getProductById(@PathVariable String id) {
		return productService.getProductById(id);
	}

	@RequestMapping("/products/byname/{name}")
	public List<Product> getProductByName(@PathVariable String name) {
		return productService.getProductByName(name);
	}

	@RequestMapping("/products/bydescription/{description}")
	public List<Product> getProductByDescription(@PathVariable String description) {
		return productService.getProductByDescription(description);
	}
}
