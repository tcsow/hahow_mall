package com.example.hahow_mall.data.product;

import java.math.BigDecimal;

/**
 * @author: tcsow
 * @date: 2024/8/25
 */
public record ProductResponse(
        String productName,
        String category,
        String imageUrl,
        BigDecimal price,
        int stock,
        String description) {
}
