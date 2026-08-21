package com.allen.furnituremanagement.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import io.swagger.v3.oas.annotations.media.Schema;
import java.math.BigDecimal;

public class CreateProductRequest {

    @Schema(description = "Unique product SKU", example = "CHAIR-001")
    @NotBlank(message = "SKU is required")
    private String sku;

    @Schema(description = "Product name", example = "Oak Dining Chair")
    @NotBlank(message = "Product name is required")
    private String name;

    @Schema(description = "Product category", example = "Chair")
    @NotBlank(message = "Category is required")
    private String category;

    @Schema(description = "Product price", example = "319.99")
    @NotNull(message = "Price is required")
    @Positive(message = "Price must be greater than 0")
    private BigDecimal price;

    @Schema(description = "Available stock quantity", example = "10")
    @NotNull(message = "Stock quantity is required")
    @PositiveOrZero(message = "Stock quantity cannot be negative")
    private Integer stockQuantity;

    public CreateProductRequest() {
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }

    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }
}