package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 购买私教：(PurchasePrivateEducation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PurchasePrivateEducation")
public class PurchasePrivateEducation implements Serializable {

    // PurchasePrivateEducation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "purchase_private_education_id")
    private Integer purchase_private_education_id;

    // 订单号
    @Basic
    private String order_number;
    // 教练编号
    @Basic
    private Integer coach_no;
    // 教练姓名
    @Basic
    private String coach_name;
    // 课程编号
    @Basic
    private String course_no;
    // 课程名称
    @Basic
    private String course_name;
    // 课程分类
    @Basic
    private String course_classification;
    // 课程价格
    @Basic
    private String course_price;
    // 课程时间
    @Basic
    private String course_time;
    // 会员
    @Basic
    private Integer member;
    // 会员姓名
    @Basic
    private String member_name;
    // 预约时间
    @Basic
    private Timestamp time_of_appointment;



    // 审核状态
    @Basic
    private String examine_state;

    // 支付状态
    @Basic
    private String pay_state;

    // 支付类型: 微信、支付宝、网银
    @Basic
    private String pay_type;







    // 审核回复
    @Basic
    private String examine_reply;



    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
