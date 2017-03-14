package com.microservices.price.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.microservices.price.dao.PriceRepository;
import com.microservices.price.model.Price;

@Service
public class PriceService {

	@Autowired
	private PriceRepository priceRepository;

	public List<Price> getAllPrices() {
		List<Price> prices = new ArrayList<>();
		priceRepository.findAll().forEach(prices::add);
		return prices;
	}

	public Price getPriceById(String id) {
		return priceRepository.findOne(id);
	}

	public List<Price> getPriceBySkuId(String skuId) {
		return priceRepository.findBySkuId(skuId);
	}

}
