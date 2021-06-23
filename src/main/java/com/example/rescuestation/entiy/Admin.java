package com.example.rescuestation.entiy;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: RescueStation
 * @author: KaKa
 * @create: 2021-06-21 21:04
 **/
public class Admin implements Serializable {

    private static final long serialVersionUID = 1L;

   // @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

   // @ApiModelProperty(value = "管理员的名字")
    //@TableField("adminName")
    private String adminName;

   // @ApiModelProperty(value = "密码")
    //@TableField("adminPwd")
    private String adminPwd;

   // @ApiModelProperty(value = "真实的名字")
   // @TableField("realName")
    private String realName;

   // @ApiModelProperty(value = "电话")
    private String telephone;

   // @ApiModelProperty(value = "邮箱")
   // @TableField("email")
    private String email;

   // @ApiModelProperty(value = "生日")
    //@DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;

   // @ApiModelProperty(value = "性别")
    private Integer sex;

   // @ApiModelProperty(value = "描述")
    private String remark;

    //@ApiModelProperty(value = "逻辑删除")
    private Integer isDeleted;

   // @ApiModelProperty(value = "创建时间")
   // @TableField(fill = FieldFill.INSERT)
    private Date gmt_create;
//    private LocalDateTime createTime;

   // @ApiModelProperty(value = "修改时间")
    //@TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmt_modified;


}
