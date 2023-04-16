package com.cny.rmstorage.service;


/**
 * @author : chennengyuan
 */
public interface StorageService {

    /**
     * 创建订单
     */
    void deduct(String commodityCode, int count);
}
