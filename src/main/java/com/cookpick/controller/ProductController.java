package com.cookpick.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cookpick.dto.ProductDTO;
import com.cookpick.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService service;

	@PostMapping(consumes = "application/json")
	public ResponseEntity<String> addProduct(@RequestBody ProductDTO product) {
		String response = service.addProduct(product);
		return ResponseEntity.ok(response);
	}

	@GetMapping(value = "/{productName}", produces = "application/json")
	public List<ProductDTO> getProducts(@PathVariable String productName) {
		return service.getProducts(productName);
	}
	
	@GetMapping
	public List<ProductDTO> getProducts(@RequestParam String productName, @RequestParam String productVendor){
		return service.getProducts(productName, productVendor);
	}
	

}
