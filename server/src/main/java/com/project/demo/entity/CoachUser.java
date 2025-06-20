package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 教练用户：(CoachUser)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CoachUser")
public class CoachUser implements Serializable {

    // CoachUser编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coach_user_id")
    private Integer coach_user_id;

    // 教练编号
    @Basic
    private String coach_no;
    // 教练姓名
    @Basic
    private String coach_name;












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
