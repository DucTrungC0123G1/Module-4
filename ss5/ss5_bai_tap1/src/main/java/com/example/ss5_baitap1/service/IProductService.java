package com.example.ss5_baitap1.service;

import com.example.ss5_baitap1.model.Product;

import java.util.List;
import java.util.Map;

public interface IProductService {
    List<Product> display();

    Product findById(int id);

    void save(Product product);

    void remove(int id);

    void update(int id, Product product);


    List<Product> findByName(String keyWord);
}
