package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 购买商品：(PurchaseGoods)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PurchaseGoods")
public class PurchaseGoods implements Serializable {

    // PurchaseGoods编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchase_goods_id")
    private Integer purchase_goods_id;

    // 订单号
    @Basic
    private String order_number;
    // 商品编号
    @Basic
    private String article_no;
    // 商品名称
    @Basic
    private String trade_name;
    // 品牌
    @Basic
    private String brand;
    // 规格
    @Basic
    private String specifications;
    // 价格
    @Basic
    private String price;
    // 会员
    @Basic
    private Integer member;
    // 会员姓名
    @Basic
    private String member_name;
    // 购买数量
    @Basic
    private String purchase_quantity;
    // 总价
    @Basic
    private String total_price;




    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;










    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
