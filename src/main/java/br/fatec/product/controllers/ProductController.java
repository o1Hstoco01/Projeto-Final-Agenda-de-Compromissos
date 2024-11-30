package br.fatec.product.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.fatec.product.entities.Product;
import br.fatec.product.services.ProductService;

@RestController
@RequestMapping("products")
public class ProductController {
    
    @Autowired
    private ProductService service;

    public List<Product> getProducts(){
        return service.getAllProducts();
    }
}
