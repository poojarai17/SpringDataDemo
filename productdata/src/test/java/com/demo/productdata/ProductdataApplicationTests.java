package com.demo.productdata;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.productdata.entities.Product;
import com.demo.productdata.entities.ProductRepository;

@SpringBootTest
class ProductdataApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void testCreate() {
		Product product = new Product();
		product.setDesc("Android");
		product.setId(1);
		product.setName("Phone");
		product.setPrice(5000.00);
		productRepository.save(product);
	}
}
