package org.example.usingthegetposthttpmethods.service;

import org.example.usingthegetposthttpmethods.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product) {
        products.add(product);
    }
    public List<Product> findAll() {
        return products;
    }
}
