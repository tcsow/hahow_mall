package com.example.hahow_mall.dao;

import com.example.hahow_mall.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author: tcsow
 * @date: 2024/8/25
 */
@Repository
public interface ProductDao extends JpaRepository<Product,Long> {
}
