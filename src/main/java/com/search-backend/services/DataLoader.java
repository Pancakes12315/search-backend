package com.searchbackend;

import com.searchbackend.models.Item;
import com.searchbackend.services.IndexService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    private final IndexService indexService;

    public DataLoader(IndexService indexService) {
        this.indexService = indexService;
    }

    @Override
    public void run(String... args) throws Exception {
        // Add sample items to Elasticsearch
        indexService.indexItem("1", new Item("1", "Nike Air Max Sneakers", "Comfortable running shoes", 120.0));
        indexService.indexItem("2", new Item("2", "Adidas Ultraboost Shoes", "High-performance running shoes", 150.0));
        indexService.indexItem("3", new Item("3", "Leather Jacket", "Stylish black leather jacket", 250.0));
        indexService.indexItem("4", new Item("4", "Blue Denim Jeans", "Classic straight-fit jeans", 60.0));
        indexService.indexItem("5", new Item("5", "iPhone 15 Pro", "Latest Apple smartphone", 999.0));
        indexService.indexItem("6", new Item("6", "Samsung Galaxy S24", "High-end Android phone", 899.0));
        indexService.indexItem("7", new Item("7", "Winter Coat", "Warm insulated coat for winter", 180.0));
        indexService.indexItem("8", new Item("8", "Running Shorts", "Lightweight sports shorts", 35.0));
        indexService.indexItem("9", new Item("9", "Bluetooth Headphones", "Noise-cancelling over-ear headphones", 200.0));
        indexService.indexItem("10", new Item("10", "Backpack", "Durable travel backpack with multiple compartments", 80.0));

        System.out.println("✅ Sample items indexed into Elasticsearch!");
    }
}
