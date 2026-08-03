package com.allen.furnituremanagement.mapper;

import com.allen.furnituremanagement.dto.request.CreateProductRequest;
import com.allen.furnituremanagement.dto.request.UpdateProductRequest;
import com.allen.furnituremanagement.dto.response.ProductResponse;
import com.allen.furnituremanagement.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface ProductMapper {

    Product toEntity(CreateProductRequest request);

    ProductResponse toResponse(Product product);

    void updateEntity(
            UpdateProductRequest request,
            @MappingTarget Product product
    );
}