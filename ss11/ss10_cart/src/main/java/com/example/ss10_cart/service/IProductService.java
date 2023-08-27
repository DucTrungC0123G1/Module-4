package com.example.ss10_cart.service;

import com.example.ss10_cart.model.Product;

import java.util.Optional;

public interface IProductService {
    Object findAll();

    Optional<Product> findById(Long id);
}
