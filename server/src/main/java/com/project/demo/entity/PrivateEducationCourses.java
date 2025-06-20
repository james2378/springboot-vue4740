package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 私教课程：(PrivateEducationCourses)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "PrivateEducationCourses")
public class PrivateEducationCourses implements Serializable {

    // PrivateEducationCourses编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "private_education_courses_id")
    private Integer private_education_courses_id;

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
    private Integer course_price;
    // 课程时间
    @Basic
    private String course_time;
    // 课时数量
    @Basic
    private String number_of_class_hours;
    // 健身地点
    @Basic
    private String fitness_location;
    // 图片
    @Basic
    private String picture;
    // 健身要点
    @Basic
    private String fitness_points;
    // 课程内容
    @Basic
    private String course_content;

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
