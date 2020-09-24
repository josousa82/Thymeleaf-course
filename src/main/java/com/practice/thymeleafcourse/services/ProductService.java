package com.practice.thymeleafcourse.services;

import com.practice.thymeleafcourse.domain.Product;

import java.util.List;

/**
 * Created by sousaJ on 24/09/2020
 * in package - com.practice.thymeleafcourse.services
 **/
public interface ProductService {
    Product getProductById(Integer id);
    List<Product> listProducts();
}
