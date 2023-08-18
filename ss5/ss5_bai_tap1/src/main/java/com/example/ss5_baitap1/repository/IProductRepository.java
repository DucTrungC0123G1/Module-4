package com.example.ss5_baitap1.repository;

import com.example.ss5_baitap1.model.Product;

import java.util.List;
import java.util.Map;

public interface IProductRepository {
    List<Product> display();


    Product findById(int id);

    void save(Product product);

    void remove(int id);

    void update(int id, Product product);


    Product search(String keyWord);
}
