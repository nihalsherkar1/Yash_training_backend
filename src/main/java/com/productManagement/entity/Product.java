package com.productManagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;


import java.time.Instant;
import java.util.Date;


@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long productId;

    private String productName;

    private Integer price;

    private Integer quantity;


    private String description;

    @Column(nullable = false, updatable = false)
    private Date date;

    private String category;


    public Product() {
    }

    public Product(Long productId, String productName, Integer price, Integer quantity, String description, Date date, String category) {
        this.productId = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.description = description;
        this.date = date;
        this.category = category;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", category='" + category + '\'' +
                '}';
    }
}
