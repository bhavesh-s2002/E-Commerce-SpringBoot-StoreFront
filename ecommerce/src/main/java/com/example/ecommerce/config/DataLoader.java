package com.example.ecommerce.config;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadData(ProductRepository repo) {
        return args -> {

            repo.save(new Product(
                    "iPhone 15",
                    "Electronics",
                    80000,
                    "Apple smartphone",
                    "iphone.jpg"
            ));

            repo.save(new Product(
                    "Nike Shoes",
                    "Fashion",
                    5000,
                    "Running shoes",
                    "nike.jpg"
            ));

            repo.save(new Product(
                    "Laptop",
                    "Electronics",
                    60000,
                    "Gaming laptop",
                    "laptop.jpg"
            ));

        };
    }
}