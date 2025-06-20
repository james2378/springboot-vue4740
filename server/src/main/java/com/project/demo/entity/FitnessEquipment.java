package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 健身器械：(FitnessEquipment)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "FitnessEquipment")
public class FitnessEquipment implements Serializable {

    // FitnessEquipment编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fitness_equipment_id")
    private Integer fitness_equipment_id;

    // 器械编号
    @Basic
    private String device_no;
    // 器械名称
    @Basic
    private String device_name;
    // 图片
    @Basic
    private String picture;
    // 器械状态
    @Basic
    private String device_status;
    // 器械说明
    @Basic
    private String device_description;
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
