package org.example.usingthegetposthttpmethods.controllers;

import org.example.usingthegetposthttpmethods.model.Product;
import org.example.usingthegetposthttpmethods.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController {
    private final ProductService productService;
    @Autowired
    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping("/products")
    public String viewProducts(Model model) {
        var products = productService.findAll();
        model.addAttribute("products", products);
        return "products.html";
    }
    @RequestMapping(path = "/products",
                    method = RequestMethod.POST)
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
