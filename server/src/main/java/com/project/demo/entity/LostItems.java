package com.project.demo.entity;

import java.sql.Date;
import java.sql.Timestamp;
import com.project.demo.entity.base.BaseEntity;
import java.io.Serializable;
import lombok.*;
import javax.persistence.*;


/**
 * 遗失物品：(LostItems)表实体类
 *
 */
@Setter
@Getter
@Entity(name = "LostItems")
public class LostItems implements Serializable {

    // LostItems编号
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lost_items_id")
    private Integer lost_items_id;

    // 物品编号
    @Basic
    private String serial_number;
    // 物品名称
    @Basic
    private String item_name;
    // 捡到日期
    @Basic
    private Timestamp pickup_date;
    // 捡到地点
    @Basic
    private String pick_up_the_place;
    // 状态
    @Basic
    private String state;

    // 点击数
    @Basic
    private Integer hits;

    // 点赞数
    @Basic
    private Integer praise_len;





	// 计时器标题
	@Basic
	private String timer_title;

	// 计时开始时间
	@Basic
	private Timestamp timing_start_time;

	// 计时结束时间
	@Basic
	private Timestamp timing_end_time;







    // 更新时间
    @Basic
    private Timestamp update_time;

    // 创建时间
    @Basic
    private Timestamp create_time;

}
