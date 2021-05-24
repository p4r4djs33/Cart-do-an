package com.example.giohangdoan.service;

import com.example.giohangdoan.model.Product;

import java.util.Optional;

public interface ProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}
