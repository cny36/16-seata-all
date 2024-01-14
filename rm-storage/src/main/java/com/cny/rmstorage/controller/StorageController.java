package com.cny.rmstorage.controller;

import com.cny.rmstorage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : chennengyuan
 */
@RestController
@RequestMapping("/storage")
public class StorageController {

    @Autowired
    private StorageService storageService;


    /**
     * 模拟扣减库存
     * url:http://localhost:9101/storage/deduct?commodityCode=1&count=10
     *
     * @param commodityCode
     * @param count
     * @return
     */
    @GetMapping("/deduct")
    public String deduct(String commodityCode, int count) {
        storageService.deduct(commodityCode, count);
        return "success";
    }
}
