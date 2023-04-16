package com.cny.rmstorage.controller;

import com.cny.rmstorage.service.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @RequestMapping("/deduct")
    public String deduct(String commodityCode, int count) {
        storageService.deduct(commodityCode, count);
        return "success";
    }
}
