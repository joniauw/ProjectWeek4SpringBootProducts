package com.example.partyinaboxweb;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @RequestMapping("/products")
    public List<Product> getAllProducts() {
        return (List<Product>) repo.findAll();
    }
}