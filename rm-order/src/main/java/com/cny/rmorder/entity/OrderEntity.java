package com.cny.rmorder.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author : chennengyuan
 */
@Entity
@Table(name = "t_order")
@Data
@ToString
public class OrderEntity implements Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "user_id")
    private String userId;

    @Column(name = "commodity_code")
    private String commodityCode;

    @Column(name = "count")
    private long count;

    @Column(name = "money")
    private long money;

}
