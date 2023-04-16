package com.cny.rmorder.controller;

import com.cny.rmorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : chennengyuan
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/create")
    public String createOrder(String userId, String commodityCode, int orderCount) {
        orderService.create(userId, commodityCode, orderCount);
        return "success";
    }
}
