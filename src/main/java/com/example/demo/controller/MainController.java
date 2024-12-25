
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import com.example.demo.service.SingletonService;
import com.example.demo.service.ProductService;

@Controller
public class MainController {

    private final SingletonService singletonService;
    private final ProductService productService;

    public MainController(SingletonService singletonService, ProductService productService) {
        this.singletonService = singletonService;
        this.productService = productService;
    }

    public void run() {
        System.out.println(singletonService.getServiceName());
        System.out.println(productService.getName());
    }
}
