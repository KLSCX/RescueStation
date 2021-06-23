package com.example.rescuestation.entiy;

import java.io.Serializable;

/**
 * @program: RescueStation
 * @author: KaKa
 * @create: 2021-06-21 21:00
 **/
public class Type implements Serializable {

    private static final long serialVersionUID = 1L;

    //@TableId(value = "id", type = IdType.AUTO)
    private Integer id;

  /*  @ApiModelProperty(value = "宠物类型")
    @TableField("petType")*/
    private String petType;
}
