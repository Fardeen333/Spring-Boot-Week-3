package com.example.codingshuttle.jpatutorial.jpatuts;

import com.example.codingshuttle.jpatutorial.jpatuts.entities.ProductEntity;
import com.example.codingshuttle.jpatutorial.jpatuts.repositories.ProductRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@SpringBootTest
class JpatutsApplicationTests {

	@Autowired
	ProductRepository productRepository;

	@Test
	void contextLoads() {
	}

	@Test
	void saveEntity() {
//		ProductEntity productEntity = ProductEntity.builder()
//				.sku("nestle1234").
//				title("Nestle Chocolate")
//				.price(BigDecimal.valueOf(125.45))
//				.quantity(12)
//				.build();
//
//		ProductEntity savedEnitity = productRepository.save(productEntity);
//		System.out.println(savedEnitity);
	}

	@Test
	void findAllEntities() {
//		List<ProductEntity> all = productRepository.findByCreatedAtAfter(LocalDateTime.of(2025, 7, 10, 0,0,0));

//		List<ProductEntity> all = productRepository.findByQuantityAndPrice(12, BigDecimal.valueOf(123.45));

//		List<ProductEntity> all = productRepository.findByQuantityGreaterThanAndPriceLessThan(12, BigDecimal.valueOf(123.45));

//		List<ProductEntity> all = productRepository.findByQuantityGreaterThanOrPriceLessThan(12, BigDecimal.valueOf(123.45));

//		List<ProductEntity> all = productRepository.findByTitleLike("%ver%");
//
//		System.out.println(all);

	}
	
	@Test
	void findUsingOptional(){
//		Optional<ProductEntity> item = productRepository.findByTitleAndPrice("Beverage", BigDecimal.valueOf(10.00));
//		item.ifPresent((entity) -> System.out.println(entity));
	}

	@Test
	void findUsingOptional2(){
//		Optional<ProductEntity> item = productRepository.findByTitleAndPriceNative("Beverage", BigDecimal.valueOf(10.00));
//		item.ifPresent((entity) -> System.out.println(entity));
	}

	@Test
	void findUsingOptional3(){
//		Optional<ProductEntity> item = productRepository.findByTitleAndPriceNamedParams("Beverage", BigDecimal.valueOf(10.00));
//		item.ifPresent((entity) -> System.out.println(entity));
	}



}
