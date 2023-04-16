package com.cny.rmmall.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : chennengyuan
 */
@FeignClient("rm-order")
public interface OrderFeignClient {

    @RequestMapping("/order/create")
    String createOrder(@RequestParam("userId") String userId,
                       @RequestParam("commodityCode") String commodityCode,
                       @RequestParam("orderCount") int orderCount);
}
