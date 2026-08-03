package com.allen.furnituremanagement.dto.response;

import java.math.BigDecimal;

public record ProductResponse(
        Long id,
        String sku,
        String name,
        String category,
        BigDecimal price,
        Integer stockQuantity
) {
}