package com.example.partyinaboxweb;

import java.util.Objects;
import javax.annotation.processing.Generated;
import javax.persistence.*;

@Entity
@Table(name="products", schema="app_data")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int product_id;


    private String product_name;
    private String product_description;
    private int product_price;
    private int product_stock;
    private String product_url;

    public Product() {};

    public Product(int id, String name, String description, int price, int stock, String url) {
        this.product_id = id;
        this.product_name = name;
        this.product_description = description;
        this.product_price = price;
        this.product_stock = stock;
        this.product_url = url;
    }

    public int getId() {
        return product_id;
    }

    public void setId(int id) {
        this.product_id = id;
    }

    public String getName() {
        return product_name;
    }

    public void setName(String name) {
        this.product_name = name;
    }

    public String getDescription() {
        return product_description;
    }

    public void setDescription(String description) {
        this.product_description = description;
    }

    public int getPrice() {
        return product_price;
    }

    public void setPrice(int price) {
        this.product_price = price;
    }

    public int getStock() {
        return product_stock;
    }

    public void setStock(int stock) {
        this.product_stock = stock;
    }

    public String getUrl() {
        return product_url;
    }

    public void setUrl(String url) {
        this.product_url = url;
    }
}
