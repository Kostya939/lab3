package org.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CartTest {
    private Cart cart;
    private Product product1;
    private Product product2;

    @Before
    public void setUp() {
        cart = new Cart();
        product1 = mock(Product.class);
        product2 = mock(Product.class);

        when(product1.getName()).thenReturn("Product 1");
        when(product2.getName()).thenReturn("Product 2");
    }

    @Test
    public void addProduct_ShouldAddProduct() {
        cart.addProduct(product1);
        assertTrue(cart.getProductsInCart().contains(product1));
    }

    @Test
    public void removeProduct_ShouldRemoveProduct() {
        cart.addProduct(product1);
        cart.removeProduct(product1);
        assertFalse(cart.getProductsInCart().contains(product1));
    }

    @Test
    public void checkout_ShouldClearCartAndCreateOrder() {
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.checkout();

        assertTrue(cart.getProductsInCart().isEmpty());
        assertFalse(cart.getOrderHistory().isEmpty());
    }

    @Test
    public void checkOrderStatus_ShouldReturnCorrectStatus() {
        cart.addProduct(product1);
        cart.checkout();
        int orderId = cart.getOrderHistory().get(0).getOrderId();

        assertEquals("Pending", cart.checkOrderStatus(orderId));
    }

    @Test
    public void checkOrderStatus_InvalidOrderId_ShouldReturnNotFound() {
        assertEquals("Order not found", cart.checkOrderStatus(999));
    }
}
