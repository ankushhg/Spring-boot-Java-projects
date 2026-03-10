package com.example.Product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.Product.dto.REQUEST.ProductRequest;
import com.example.Product.dto.RESPONSE.ProductResponse;
import com.example.Product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/adds")
    public ProductResponse calculatebi(@RequestBody ProductRequest req) {
        return productService.calculatebi(req);
    }
}