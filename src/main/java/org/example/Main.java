package org.example;

public class Main {
    public static void main(String[] args) {
        Cart cart = new Cart();
        Product product1 = new Product(1, "Product 1", 10.0);
        cart.addProduct(product1);
        cart.checkout();
    }
}
