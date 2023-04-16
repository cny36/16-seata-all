package com.cny.rmstorage.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author : chennengyuan
 */
@Entity
@Table(name = "t_storage")
@Data
@ToString
public class StorageEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "commodity_code")
    private String commodityCode;

    @Column(name = "count")
    private long count;

}
