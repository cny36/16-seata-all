package com.cny.rmorder.service;

import com.cny.rmorder.entity.OrderEntity;

/**
 * @author : chennengyuan
 */
public interface OrderService {

    /**
     * 创建订单
     */
    OrderEntity create(String userId, String commodityCode, int orderCount);
}
