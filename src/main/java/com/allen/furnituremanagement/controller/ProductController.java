package com.allen.furnituremanagement.controller;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import com.allen.furnituremanagement.dto.request.UpdateProductRequest;
import com.allen.furnituremanagement.dto.request.CreateProductRequest;
import com.allen.furnituremanagement.dto.response.ProductResponse;
import com.allen.furnituremanagement.dto.response.PagedResponse;
import jakarta.validation.Valid;
import com.allen.furnituremanagement.service.ProductService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@RestController
@RequestMapping("/products")
@Tag(
        name = "Product Management",
        description = "APIs for managing furniture products"
)
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping
    @Operation(
            summary = "Search and list products",
            description = "Retrieves products with optional keyword search, pagination, and sorting."
    )
    @ApiResponse(
            responseCode = "200",
            description = "Products retrieved successfully"
    )
    public PagedResponse<ProductResponse> getAllProducts(

            @Parameter(description = "Page number, starting from 0", example = "0")
            @RequestParam(defaultValue = "0") int page,

            @Parameter(description = "Number of products per page", example = "10")
            @RequestParam(defaultValue = "10") int size,

            @Parameter(description = "Product field used for sorting", example = "price")
            @RequestParam(defaultValue = "id") String sortBy,

            @Parameter(description = "Sort direction: asc or desc", example = "asc")
            @RequestParam(defaultValue = "asc") String direction,

            @Parameter(description = "Optional keyword for case-insensitive product name search", example = "oak")
            @RequestParam(required = false) String keyword) {

        return productService.getAllProducts(
                page,
                size,
                sortBy,
                direction,
                keyword
        );
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    @Operation(
            summary = "Create product",
            description = "Creates a new furniture product."
    )
    @ApiResponse(
            responseCode = "201",
            description = "Product created successfully"
    )
    @ApiResponse(
            responseCode = "400",
            description = "Invalid product data"
    )
    public ProductResponse addProduct(
            @Valid @RequestBody CreateProductRequest request) {

        return productService.addProduct(request);
    }

    @GetMapping("/{id}")
    @Operation(
            summary = "Get product by ID",
            description = "Retrieves a single furniture product using its unique product ID."
    )
    @ApiResponse(
            responseCode = "200",
            description = "Product retrieved successfully"
    )
    @ApiResponse(
            responseCode = "404",
            description = "Product not found"
    )
    public ProductResponse getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    @PutMapping("/{id}")
    @Operation(
            summary = "Update product",
            description = "Updates an existing furniture product using its product ID."
    )
    @ApiResponse(
            responseCode = "200",
            description = "Product updated successfully"
    )
    @ApiResponse(
            responseCode = "400",
            description = "Invalid product data"
    )
    @ApiResponse(
            responseCode = "404",
            description = "Product not found"
    )
    public ProductResponse updateProduct(
            @PathVariable Long id,
            @Valid @RequestBody UpdateProductRequest request) {

        return productService.updateProduct(id, request);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @Operation(
            summary = "Delete product",
            description = "Deletes a furniture product using its product ID."
    )
    @ApiResponse(
            responseCode = "204",
            description = "Product deleted successfully"
    )
    @ApiResponse(
            responseCode = "404",
            description = "Product not found"
    )
    public void deleteProduct(@PathVariable Long id) {
        productService.deleteProduct(id);
    }
}