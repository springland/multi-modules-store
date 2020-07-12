package com.springland365.store.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springland365.store.model.Product;
@RestController
public class StoreController {

    @GetMapping("/product")
    public Product  getProduct()
    {
        return new Product("Book" , "Sample Book");
    }
}
