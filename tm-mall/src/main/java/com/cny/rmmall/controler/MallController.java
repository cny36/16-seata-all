package com.cny.rmmall.controler;

import com.cny.rmmall.service.MallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : chennengyuan
 */
@RestController
@RequestMapping("/mall")
public class MallController {

    @Autowired
    private MallService mallService;

    /**
     * http://localhost:8888/mall/sale?userId=9&commodityCode=111&orderCount=999
     * 当orderCount大于库存时，会发生全局回滚
     *
     * @param userId
     * @param commodityCode
     * @param orderCount
     * @return
     */
    @RequestMapping("/sale")
    public String sale(@RequestParam("userId") String userId,
                       @RequestParam("commodityCode") String commodityCode,
                       @RequestParam("orderCount") int orderCount) {
        return mallService.sale(userId, commodityCode, orderCount);
    }
}
