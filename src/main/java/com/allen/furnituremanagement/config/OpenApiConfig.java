package com.allen.furnituremanagement.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {

    @Bean
    public OpenAPI furnitureInventoryOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("Furniture Inventory Management API")
                        .version("1.0.0")
                        .description(
                                "RESTful API for managing furniture products, " +
                                        "including search, pagination, sorting, validation, " +
                                        "and inventory-related operations."
                        ));
    }
}