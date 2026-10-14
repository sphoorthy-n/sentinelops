package com.sentinelops.orderservice.controller;

import com.sentinelops.orderservice.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public Order getOrders() {
        return new Order(101, "Laptop", 2, "CREATED");
    }
}
