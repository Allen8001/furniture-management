package com.allen.furnituremanagement.dto.response;

import java.math.BigDecimal;

public class ProductResponse {

    private Long id;
    private String sku;
    private String name;
    private String category;
    private BigDecimal price;
    private Integer stockQuantity;

    public ProductResponse() {
    }

    public ProductResponse(
            Long id,
            String sku,
            String name,
            String category,
            BigDecimal price,
            Integer stockQuantity) {

        this.id = id;
        this.sku = sku;
        this.name = name;
        this.category = category;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public Long getId() {
        return id;
    }

    public String getSku() {
        return sku;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }
}