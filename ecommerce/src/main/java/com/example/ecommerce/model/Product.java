package com.example.ecommerce.model;

import jakarta.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String category;

    private double price;

    private String description;

    private String imageUrl;

    public Product() {}

    public Product(String name, String category, double price, String description, String imageUrl) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public Long getId() { return id; }

    public String getName() { return name; }

    public String getCategory() { return category; }

    public double getPrice() { return price; }

    public String getDescription() { return description; }

    public String getImageUrl() { return imageUrl; }

    public void setId(Long id) { this.id = id; }

    public void setName(String name) { this.name = name; }

    public void setCategory(String category) { this.category = category; }

    public void setPrice(double price) { this.price = price; }

    public void setDescription(String description) { this.description = description; }

    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}