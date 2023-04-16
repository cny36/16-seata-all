package com.cny.rmorder.dao;

import com.cny.rmorder.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : chennengyuan
 */
public interface OrderRepository extends JpaRepository<OrderEntity,Long> {
}
