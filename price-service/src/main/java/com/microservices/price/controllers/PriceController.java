package com.microservices.price.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.microservices.price.model.Price;
import com.microservices.price.services.PriceService;

public class PriceController {
	@Autowired
	private PriceService priceService;

	@RequestMapping("/prices")
	public List<Price> getAllPrices() {
		return priceService.getAllPrices();
	}

	@RequestMapping("/price/{id}")
	public Price getPriceById(@PathVariable String id) {
		return priceService.getPriceById(id);
	}

	@RequestMapping("/price/getbysku/{skuId}")
	public List<Price> getBySkuId(@PathVariable String skuId) {
		return priceService.getPriceBySkuId(skuId);
	}
}
