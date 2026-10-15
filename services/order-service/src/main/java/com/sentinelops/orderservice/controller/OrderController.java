
package com.sentinelops.orderservice.controller;

import com.sentinelops.orderservice.dto.CreateOrderRequest;
import com.sentinelops.orderservice.model.Order;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class OrderController {

    @GetMapping("/orders")
    public Order getOrders() {
        return new Order(101, "Laptop", 2, "CREATED");
    }

    @PostMapping("/orders")
    @ResponseStatus(HttpStatus.CREATED)
    public Order createOrder(@RequestBody CreateOrderRequest request) {

        return new Order(
                102,
                request.getProduct(),
                request.getQuantity(),
                "CREATED"
        );
    }
}

