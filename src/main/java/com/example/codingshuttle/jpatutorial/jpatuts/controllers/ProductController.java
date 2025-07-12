package com.example.codingshuttle.jpatutorial.jpatuts.controllers;

import com.example.codingshuttle.jpatutorial.jpatuts.entities.ProductEntity;
import com.example.codingshuttle.jpatutorial.jpatuts.repositories.ProductRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    private final int PAGE_SIZE = 5;

    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping
    public List<ProductEntity> getAll(@RequestParam(defaultValue = "id") String sortBy,
                                      @RequestParam(defaultValue = "0") Integer pageNumber) {
//        List<ProductEntity> result = productRepository.findAllByOrderByPrice();
//        return result;

//        return productRepository.findAllBy(Sort.by(sortBy));

//        return productRepository.findAllBy(Sort.by(Sort.Direction.ASC, sortBy));

//        return productRepository.findAllBy(Sort.by(Sort.Direction.ASC, sortBy, "quantity"));

//        return productRepository.findAllBy(Sort.by(Sort.Order.asc(sortBy), Sort.Order.desc("quantity")));

        Pageable pageable = PageRequest.of(
                pageNumber,
                PAGE_SIZE,
                Sort.by(Sort.Order.asc(sortBy), Sort.Order.desc("quantity"))
        );
//        return productRepository.findAllBy(pageable).getContent();
        return productRepository.findAllBy(pageable);

    }


}
