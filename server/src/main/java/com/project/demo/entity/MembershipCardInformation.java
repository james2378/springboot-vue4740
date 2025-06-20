package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 会员卡信息：(MembershipCardInformation)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "MembershipCardInformation")
public class MembershipCardInformation implements Serializable {

    // MembershipCardInformation编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "membership_card_information_id")
    private Integer membership_card_information_id;

    // 会员编号
    @Basic
    private Integer member_number;
    // 会员姓名
    @Basic
    private String member_name;
    // 会员卡号
    @Basic
    private String membership_card_number;
    // 会员卡类型
    @Basic
    private String membership_card_type;
    // 价格
    @Basic
    private String price;
    // 办卡时间
    @Basic
    private Timestamp card_handling_time;
    // 到期时间
    @Basic
    private Timestamp expiration_time;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
