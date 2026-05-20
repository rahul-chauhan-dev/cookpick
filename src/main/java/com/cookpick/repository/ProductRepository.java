package com.cookpick.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.cookpick.dto.ProductDTO;

import jakarta.annotation.PostConstruct;
@Repository
public class ProductRepository {
	List<ProductDTO> products=null;
	ProductDTO product1=null;
	ProductDTO product2=null;
	
	@PostConstruct
	public void initializer() {
		product1=new ProductDTO();
		product1.setProductCode(101);
		product1.setProductName("Apple");
		product1.setProductVendor("FreshFarm");
		product1.setProductPrice(120);
		product1.setProductInStock(80);
		
		product2=new ProductDTO();
		product2.setProductCode(102);
		product2.setProductName("Apple");
		product2.setProductVendor("OrganicMart");
		product2.setProductPrice(200);
		product2.setProductInStock(50);
		
		products=new ArrayList<>();
		
		products.add(product1);
		products.add(product2);
	}
	
	public void addProduct(ProductDTO product) {
		products.add(product);
	}
	
	public List<ProductDTO> getProducts(String productName){
		List<ProductDTO> resultSet=new ArrayList<>();
		for(ProductDTO product:products) {
			if(product.getProductName().equals(productName))resultSet.add(product);
		}
		return resultSet;
	}
	
	public List<ProductDTO> getProducts(String productName, String productVendor){
		List<ProductDTO> resultSet=new ArrayList<>();
		for(ProductDTO product:products) {
			if(product.getProductName().equals(productName) && product.getProductVendor().equals(productVendor)) resultSet.add(product);
		}
		return resultSet;
	}
}
