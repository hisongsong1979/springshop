package com.javastudy.spring.domain;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class goodsSku {
    @Id
    @GeneratedValue
    private long id;

    @Column(name = "sku_no",columnDefinition="varchar(50) COMMENT '商品编号，唯一' ",nullable = false, unique = true)
    private  String skuNo;

    @Column(name = "sku_name", columnDefinition = "varchar(50)",nullable = false)
    private String skuName;

    @Column(name = "price",columnDefinition="Decimal(10,2) default '0.00' ", nullable = false)
    private float price;

    @Column(name = "stock",nullable = false)
    private int  stock;

    @Column(name = "shop_id", nullable = false)
    private long shopId;

    @Column(name = "gmt_create" )
    @CreationTimestamp
    private Date gmtCreate;

    @Column(name = "gmt_update")
    @LastModifiedDate
    private Date gmtUpdate;

}
