package com.example.hahow_mall.service.impl;

import com.example.hahow_mall.dao.ProductDao;
import com.example.hahow_mall.data.product.ProductResponse;
import com.example.hahow_mall.enums.ErrorCodeEnum;
import com.example.hahow_mall.exception.CustomizeException;
import com.example.hahow_mall.mapper.ProductMapper;
import com.example.hahow_mall.model.Product;
import com.example.hahow_mall.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: tcsow
 * @date: 2024/8/25
 */
@Service
@Slf4j
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {
    private final ProductDao productDao;
    private final ProductMapper productMapper;

    @Override
    @Transactional(readOnly = true)
    public ProductResponse getProductById(Long id) {
        Product product = productDao.findById(id)
                .orElseThrow(() -> new CustomizeException(ErrorCodeEnum.PRODUCT_NOT_FOUND_ERROR, new Object[]{id,"123"}, new Object[]{id}));

        return productMapper.toResponse(product);
//        return null;
    }
}
