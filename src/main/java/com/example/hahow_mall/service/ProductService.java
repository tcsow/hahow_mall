package com.example.hahow_mall.service;

import com.example.hahow_mall.data.product.ProductResponse;

/**
 * @author: tcsow
 * @date: 2024/8/25
 */
public interface ProductService {
    ProductResponse getProductById(Long id);
}
