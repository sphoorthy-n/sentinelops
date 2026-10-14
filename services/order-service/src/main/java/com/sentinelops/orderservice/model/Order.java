
package com.sentinelops.orderservice.model;

public class Order {

    private int orderId;
    private String product;
    private int quantity;
    private String status;

    public Order(int orderId, String product,
                 int quantity, String status) {
        this.orderId = orderId;
        this.product = product;
        this.quantity = quantity;
        this.status = status;
    }

    public int getOrderId() {
        return orderId;
    }

    public String getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getStatus() {
        return status;
    }
}
