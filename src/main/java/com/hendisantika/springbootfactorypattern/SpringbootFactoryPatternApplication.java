package com.hendisantika.springbootfactorypattern;

import com.hendisantika.springbootfactorypattern.factory.ProductFactory;
import com.hendisantika.springbootfactorypattern.service.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootFactoryPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootFactoryPatternApplication.class, args);
		// create product from factory...
		Product productOne = ProductFactory.getProduct("PRODUCT_ONE");
		Product productTwo = ProductFactory.getProduct("PRODUCT_TWO");

		productOne.calculateSomething();
		productTwo.calculateSomething();
	}

}
