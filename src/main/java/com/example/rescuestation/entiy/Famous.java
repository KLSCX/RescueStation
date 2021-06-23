package com.example.rescuestation.entiy;

import java.io.Serializable;

/**
 *
 *@program: RescueStation
 * @author: KaKa
 * @create: 2021-06-21 21:01
 **/
public class Famous implements Serializable {
    private static final long serialVersionUID = 1L;

    //@TableId(value = "id", type = IdType.AUTO)
    private Integer id;

   /* @ApiModelProperty(value = "宠物姓名")
    @TableField("petName")*/
    private String petName;

    //@ApiModelProperty(value = "图片")
    private String pic;

   //@ApiModelProperty(value = "描述")
    private String remark;

}
