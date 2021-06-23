package com.example.rescuestation.entiy;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: RescueStation
 * @author: KaKa
 * @create: 2021-06-21 21:29
 **/
public class Activity implements Serializable {

    private static final long serialVersionUID = 1L;

    //@TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    //@ApiModelProperty(value = "活动的主题")
    //@TableField("title")
    private String title;

    //@ApiModelProperty(value = "活动发生的事件")
    //@TableField("event")
    private String event;

    //@ApiModelProperty(value = "活动时间")
    //@TableField("times")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date times;

    //@ApiModelProperty(value = "活动地点")
    //@TableField("address")
    private String address;

    //@ApiModelProperty(value = "逻辑删除")
    private Integer isDeleted;

    //@ApiModelProperty(value = "创建时间")
    //@TableField(fill = FieldFill.INSERT)
    private Date gmt_create;
//    private LocalDateTime createTime;

    //@ApiModelProperty(value = "修改时间")
    //@TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmt_modified;
}
