package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 课程类别：(CourseCategory)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "CourseCategory")
public class CourseCategory implements Serializable {

    // CourseCategory编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_category_id")
    private Integer course_category_id;

    // 课程类别
    @Basic
    private String course_category;














    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
