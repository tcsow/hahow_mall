package com.example.hahow_mall.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.math.BigDecimal;

/**
 * @author: tcsow
 * @date: 2024/8/25
 */
@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Entity(name = "product")
public class Product extends BaseModel {
    private String productName;
    private String category;
    private String imageUrl;
    private BigDecimal price;
    private Integer stock;
    private String description;
}
