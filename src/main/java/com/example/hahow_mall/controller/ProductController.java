package com.example.hahow_mall.controller;

import com.example.hahow_mall.data.product.ProductResponse;
import com.example.hahow_mall.data.product.data.BaseResponse;
import com.example.hahow_mall.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: tcsow
 * @date: 2024/8/25
 */
@RestController
@RequestMapping("products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;

    @GetMapping("/{id}")
    public BaseResponse<ProductResponse> getProduct(@PathVariable Long id) {
        return BaseResponse.success(productService.getProductById(id), HttpStatus.ACCEPTED.value());
    }
}
