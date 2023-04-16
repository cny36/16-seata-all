package com.cny.rmstorage.service;

import com.cny.rmstorage.dao.StorageRepository;
import com.cny.rmstorage.entity.StorageEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author : chennengyuan
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageRepository storageRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void deduct(String commodityCode, int count) {
        StorageEntity storageEntity = storageRepository.findByCommodityCode(commodityCode);
        if (storageEntity.getCount() < count) {
            throw new RuntimeException("该商品库存不足");
        }
        storageEntity.setCount(storageEntity.getCount() - count);
        storageRepository.save(storageEntity);
    }
}
