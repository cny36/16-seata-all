package com.cny.rmmall.service;

import com.cny.rmmall.feign.OrderFeignClient;
import com.cny.rmmall.feign.StorageFeignClient;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : chennengyuan
 */
@Slf4j
@Service
public class MallServiceImpl implements MallService {

    @Autowired
    private OrderFeignClient orderFeignClient;

    @Autowired
    private StorageFeignClient storageFeignClient;


    /**
     * 模拟用户下单操作
     *
     * @param userId
     * @param commodityCode
     * @param orderCount
     * @return
     */
    @Override
    @GlobalTransactional(name = "tx-mall", rollbackFor = Exception.class, timeoutMills = 100000)//Seata全局事务
    public String sale(String userId, String commodityCode, int orderCount) {
        String orderResult = orderFeignClient.createOrder(userId, commodityCode, orderCount);
        log.info("orderResult:{}", orderResult);
        String storageResult = storageFeignClient.deduct(commodityCode, orderCount);
        log.info("storageResult:{}", storageResult);
        return orderResult + ":" + storageResult;
    }
}
