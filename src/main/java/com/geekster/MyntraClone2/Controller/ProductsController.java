package com.geekster.MyntraClone2.Controller;

import com.geekster.MyntraClone2.Models.Products;
import com.geekster.MyntraClone2.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductsController {
    @Autowired
    ProductService productService;
    @PostMapping()
    public void addProduct(@RequestBody Products product){
        productService.insertProduct(product);
    }
    @GetMapping()
    public Iterable<Products> getProducts(){
        return productService.getAllProducts();
    }
}
