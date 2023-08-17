package com.example.ss4_baitap1.repository;

import com.example.ss4_baitap1.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> display();


    Product findById(int id);

    void save(Product product);
}
