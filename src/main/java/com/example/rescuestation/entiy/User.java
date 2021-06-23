package com.example.rescuestation.entiy;


import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

 /*   @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)*/
    private Integer id;
/*
    @ApiModelProperty(value = "用户姓名")
    @TableField("username")*/
    private String username;

 /*   @ApiModelProperty(value = "真实姓名")
    @TableField("realname")*/
    private String realname;

   // @ApiModelProperty(value = "用户密码")
    private String password;

   // @ApiModelProperty(value = "性别")
    private String sex;

   // @ApiModelProperty(value = "年龄")
    private Integer age;

   // @ApiModelProperty(value = "电话")
    private String telephone;

    //@ApiModelProperty(value = "email")
   // @TableField("email")
    private String email;

   // @ApiModelProperty(value = "地址")
    private String address;

    //@ApiModelProperty(value = "有无领养宠物的经历 0 是没有 1 是有")
    private Integer state;

   // @ApiModelProperty(value = "逻辑删除")
    private Integer is_deleted;

   // @ApiModelProperty(value = "领养的宠物id 0:没有,大于0:有")
    private Integer pid;

    //@ApiModelProperty(value = "创建时间")
   // @TableField(fill = FieldFill.INSERT)
    private Date gmt_create;
//    private LocalDateTime createTime;

   // @ApiModelProperty(value = "修改时间")
   // @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmt_modified;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(Integer is_deleted) {
        this.is_deleted = is_deleted;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
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
}
/*
import lombok.Data;*/

/**
 * @program: RescueStation
 * @author: KaKa
 * @create: 2021-06-17 08:02
 **/
/*
@Data
public class User {
    Integer id;
    String name;
    String password;

    public User() {
    }

    public User(Integer id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
*/
