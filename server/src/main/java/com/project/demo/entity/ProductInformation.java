package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 商品信息：(ProductInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "ProductInformation")
public class ProductInformation implements Serializable {

    // ProductInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_information_id")
    private Integer product_information_id;

    // 商品编号
    @Basic
    private String article_no;
    // 商品名称
    @Basic
    private String trade_name;
    // 图片
    @Basic
    private String picture;
    // 品牌
    @Basic
    private String brand;
    // 规格
    @Basic
    private String specifications;
    // 价格
    @Basic
    private Integer price;
    // 详情
    @Basic
    private String details;

    // 点击数
    @Basic
    private Integer hits;

    // 点赞数
    @Basic
    private Integer praise_len;












    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
