package com.javastudy.spring.domain;


import org.apache.tomcat.jni.Time;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Entity

public class goodsSpu {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "spu_no",columnDefinition="varchar(50) COMMENT '商品编号，唯一' ",nullable = false, unique = true)
    private  String spuNo;

    @Column(name = "goods_name", columnDefinition = "varchar(50)",nullable = false)
    private String goodsName;

    @Column(name = "low_price",columnDefinition="Decimal(10,2) default '0.00' ", nullable = false)
    private float lowPrice;

    @Column(name = "category_id",nullable = false)
    private String categoryId;

    @Column(name = "brand_id", nullable = false)
    private String brandId;

    @Column(name = "gmt_create" )
    @CreationTimestamp
    private Date gmtCreate;

    @Column(name = "gmt_update")
    @LastModifiedDate
    private Date gmtUpdate;

    public long getId() {
        return id;
    }

    public float getLowPrice() {
        return lowPrice;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public String getSpuNo() {
        return spuNo;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public String getBrandId() {
        return brandId;
    }

    public Date getGmtUpdate() {
        return gmtUpdate;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public void setLowPrice(float lowPrice) {
        this.lowPrice = lowPrice;
    }

    public void setSpuNo(String spuNo) {
        this.spuNo = spuNo;
    }

    public void setGmtUpdate(Date gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }


}
