package com.cny.rmorder.service;

import com.cny.rmorder.dao.OrderRepository;
import com.cny.rmorder.entity.OrderEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : chennengyuan
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderDAO;

    @Transactional
    public OrderEntity create(String userId, String commodityCode, int orderCount) {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setUserId(userId);
        orderEntity.setCommodityCode(commodityCode);
        orderEntity.setCount(orderCount);
        return orderDAO.saveAndFlush(orderEntity);
    }
}
