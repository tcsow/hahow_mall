package com.example.hahow_mall.mapper;

import com.example.hahow_mall.data.product.ProductResponse;
import com.example.hahow_mall.model.Product;
import org.mapstruct.BeanMapping;
import org.mapstruct.Builder;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

/**
 * @author: tcsow
 * @date: 2024/8/25
 */
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING, builder = @Builder(disableBuilder = true))
public interface ProductMapper {

    @BeanMapping(ignoreByDefault = true)
    @Mapping(target = "productName",source = "productName")
    @Mapping(target = "category",source = "category")
    @Mapping(target = "imageUrl",source = "imageUrl")
    @Mapping(target = "price",source = "price")
    @Mapping(target = "stock",source = "stock")
    @Mapping(target = "description",source = "description")
    ProductResponse toResponse(Product product);
}
