package com.example.rescuestation.entiy;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

/**
 * @program: RescueStation
 * @author: KaKa
 * @create: 2021-06-19 17:42
 **/
/*
public class Pet {
    Integer petId;
    //宠物名
    String petName;
    //宠物种类
    String petType;
    //体重
    String weight;
    //发现地点
    String position;
    //相关描述
    String description;

    public Pet(Integer petId, String petName, String petType, String weight, String position, String description) {
        this.petId = petId;
        this.petName = petName;
        this.petType = petType;
        this.weight = weight;
        this.position = position;
        this.description = description;
    }

    public Integer getPetId() {
        return petId;
    }

    public void setPetId(Integer petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
*/


public class Pet implements Serializable {

    private static final long serialVersionUID = 1L;

   // @TableId(value = "id", type = IdType.AUTO)
    private Integer id;
/*
    @ApiModelProperty(value = "宠物姓名")
    @TableField("petName")*/
    private String petName;

  /*  @ApiModelProperty(value = "宠物种类")
    @TableField("petType")*/
    private String petType;

   // @ApiModelProperty(value = "性别")
    private Integer sex;

   // @ApiModelProperty(value = "生日")
  //  @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date birthday;

   // @ApiModelProperty(value = "图片")
    private String pic;

   // @ApiModelProperty(value = "0 没有申请领养 1 被申请领养 ")
    private Integer state;

   // @ApiModelProperty(value = "领养的主人 0:没有,大于0:有")
    private Integer uid;

   // @ApiModelProperty(value = "描述")
    private String remark;

   // @ApiModelProperty(value = "逻辑删除")
    private Integer is_deleted;

/*    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)*/
    private Date gmt_create;
//    private LocalDateTime createTime;

/*    @ApiModelProperty(value = "修改时间")
    @TableField(fill = FieldFill.INSERT_UPDATE)*/
    private Date gmt_modified;
/*
    @ApiModelProperty(value = "乐观锁")
    @Version*/
    private Integer version;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getPetType() {
        return petType;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    public Date getGmt_create() {
        return gmt_create;
    }

    public void setGmt_create(Date gmt_create) {
        this.gmt_create = gmt_create;
    }

    public Date getGmt_modified() {
        return gmt_modified;
    }

    public void setGmt_modified(Date gmt_modified) {
        this.gmt_modified = gmt_modified;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}


/*
Integer id;
String petName;
String petType;
Integer sex;
Date birthday;
String pic;
Integer state;
Integer uid;
String remark;
Integer is_deleted;
Date gmt_create;
Date gmt_modified;
Integer version;
*/

