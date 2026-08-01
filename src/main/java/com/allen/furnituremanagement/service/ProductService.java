package com.allen.furnituremanagement.service;

import com.allen.furnituremanagement.dto.request.UpdateProductRequest;
import com.allen.furnituremanagement.dto.request.CreateProductRequest;
import com.allen.furnituremanagement.dto.response.ProductResponse;
import com.allen.furnituremanagement.mapper.ProductMapper;
import com.allen.furnituremanagement.exception.ProductNotFoundException;
import com.allen.furnituremanagement.model.Product;
import com.allen.furnituremanagement.repository.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductService {

    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    public ProductService(
            ProductRepository productRepository,
            ProductMapper productMapper) {

        this.productRepository = productRepository;
        this.productMapper = productMapper;
    }

    public List<ProductResponse> getAllProducts() {
        return productRepository.findAll()
                .stream()
                .map(productMapper::toResponse)
                .toList();
    }
    public ProductResponse addProduct(CreateProductRequest request) {

        Product product = productMapper.toEntity(request);

        Product savedProduct = productRepository.save(product);

        return productMapper.toResponse(savedProduct);
    }

    public ProductResponse getProductById(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));

        return productMapper.toResponse(product);
    }

    public ProductResponse updateProduct(
            Long id,
            UpdateProductRequest request) {

        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));

        existingProduct.setSku(request.getSku());
        existingProduct.setName(request.getName());
        existingProduct.setCategory(request.getCategory());
        existingProduct.setPrice(request.getPrice());
        existingProduct.setStockQuantity(request.getStockQuantity());

        Product savedProduct = productRepository.save(existingProduct);

        return productMapper.toResponse(savedProduct);
    }

    public void deleteProduct(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ProductNotFoundException(id));

        productRepository.delete(product);
    }

}

