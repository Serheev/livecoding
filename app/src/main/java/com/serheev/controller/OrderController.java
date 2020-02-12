package com.serheev.controller;

import com.serheev.dto.Order;
import com.serheev.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @GetMapping
    public Order findOrderById(@RequestParam("id") Long id) {
        return service.getOrderById(id);
    }

}
