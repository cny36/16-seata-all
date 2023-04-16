package com.cny.rmstorage.dao;

import com.cny.rmstorage.entity.StorageEntity;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : chennengyuan
 */
public interface StorageRepository extends JpaRepository<StorageEntity,Long> {
    StorageEntity findByCommodityCode(String commodityCode);
}
