package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 会员用户：(MemberUsers)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "MemberUsers")
public class MemberUsers implements Serializable {

    // MemberUsers编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "member_users_id")
    private Integer member_users_id;

    // 会员编号
    @Basic
    private String member_no;
    // 会员姓名
    @Basic
    private String member_name;












    // 用户编号
    @Id
    @Column(name = "user_id")
    private Integer userId;


    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
