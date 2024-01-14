package com.cny.rmorder.controller;

import com.cny.rmorder.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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

    /**
     * 模拟创建订单
     * 请求url:http://localhost:8101/order/create?userId=zs&commodityCode=1&orderCount=10
     *
     * @param userId
     * @param commodityCode
     * @param orderCount
     * @return
     */
    @GetMapping("/create")
    public String createOrder(String userId, String commodityCode, int orderCount) {
        orderService.create(userId, commodityCode, orderCount);
        return "success";
    }
}
