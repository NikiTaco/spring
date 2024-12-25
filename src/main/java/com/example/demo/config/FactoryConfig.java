
package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.demo.service.ProductService;

@Configuration
public class FactoryConfig {

    @Bean
    public ProductService productService() {
        return new ProductService("CustomProductService");
    }
}
