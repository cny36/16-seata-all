package com.cny.rmmall.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author : chennengyuan
 */
@FeignClient("rm-storage")
public interface StorageFeignClient {

    @RequestMapping("/storage/deduct")
    String deduct(@RequestParam("commodityCode") String commodityCode,
                  @RequestParam("count") int count);

}
