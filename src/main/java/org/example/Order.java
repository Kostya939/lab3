package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Order {
    private static int nextOrderId = 1;

    private final int orderId;
    private final List<Product> products;
    private final String status;

    public Order(int orderId, List<Product> products, String status) {
        this.orderId = orderId;
        this.products = products;
        this.status = status;
    }

    public static int generateOrderId() {
        return nextOrderId++;
    }

    @Override
    public String toString() {
        String productDetails = products.stream()
                .map(Product::toString)
                .collect(Collectors.joining("\n"));
        return "Order ID: " + orderId + "\nProducts:\n" + productDetails + "\nStatus: " + status;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getStatus() {
        return status;
    }
}
