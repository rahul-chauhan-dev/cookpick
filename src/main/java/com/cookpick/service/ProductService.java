package com.cookpick.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cookpick.dto.ProductDTO;
import com.cookpick.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository repository;

	public String addProduct(ProductDTO product) {
		repository.addProduct(product);
		return product.getProductName() + " added successfully.";
	}

	public List<ProductDTO> getProducts(String productName) {
		return repository.getProducts(productName);
	}

	public List<ProductDTO> getProducts(String productName, String productVendor) {
		return repository.getProducts(productName, productVendor);
	}

	public List<ProductDTO> getProducts(List<String> vendors) {
		return repository.getProducts(vendors);
	}
}
