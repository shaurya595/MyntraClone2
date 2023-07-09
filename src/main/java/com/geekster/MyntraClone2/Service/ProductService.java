package com.geekster.MyntraClone2.Service;

import com.geekster.MyntraClone2.Models.Products;
import com.geekster.MyntraClone2.Repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo;
    public void insertProduct(Products product) {
        productRepo.save(product);
    }

    public Iterable<Products> getAllProducts() {
        Iterable<Products> allProduct = productRepo.findAll();
        return allProduct;
    }
}
