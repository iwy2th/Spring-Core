package org.example.usingthegetposthttpmethods.controllers;

import org.example.usingthegetposthttpmethods.model.Product;
import org.example.usingthegetposthttpmethods.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ProductsController {
    private final ProductService productService;
    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }
    @PostMapping("/products")
    public String addProduct(@RequestParam(defaultValue = "loi") String name,
                             @RequestParam(defaultValue = "5.0") double price,
                             Model model
    ) {
        Product p = new Product();
        p.setName(name);
        p.setPrice(price);
        productService.addProduct(p);
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }
}
