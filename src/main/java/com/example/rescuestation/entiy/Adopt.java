package com.example.rescuestation.entiy;

import java.util.Date;

/**
 * @program: RescueStation
 * @author: KaKa
 * @create: 2021-06-21 21:08
 **/
public class Adopt {

    private static final long serialVersionUID = 1L;

    //@TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    //@ApiModelProperty(value = "用户表id的外键")
    private Integer userId;

    //@ApiModelProperty(value = "宠物表id的外键")
    private Integer petId;

    //@ApiModelProperty(value = "收养时间")
   // @TableField("adoptTime")
    private Date adoptTime;

   // @ApiModelProperty(value = "是否同意被领养 0 是不同意 1 还在审核 2 是同意")
    private Integer state;

}
