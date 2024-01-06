package org.example;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private final List<Product> productsInCart = new ArrayList<>();
    private final List<Order> orderHistory = new ArrayList<>();

    public void addProduct(Product product) {
        productsInCart.add(product);
        System.out.println(product + " added to cart.");
    }

    public void removeProduct(Product product) {
        if (productsInCart.remove(product)) {
            System.out.println(product + " removed from cart.");
        } else {
            System.out.println("Product not in cart.");
        }
    }

    public void checkout() {
        if (productsInCart.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        Order newOrder = new Order(Order.generateOrderId(), productsInCart, "Pending");
        orderHistory.add(newOrder);
        productsInCart.clear();

        System.out.println("Order placed: " + newOrder);
    }

    public String checkOrderStatus(int orderId) {
        return orderHistory.stream()
                .filter(order -> order.getOrderId() == orderId)
                .findFirst()
                .map(Order::getStatus)
                .orElse("Order not found");
    }

    public List<Product> getProductsInCart() {
        return new ArrayList<>(productsInCart);
    }

    public List<Order> getOrderHistory() {
        return new ArrayList<>(orderHistory);
    }
}
