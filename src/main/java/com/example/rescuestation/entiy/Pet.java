package com.example.rescuestation.entiy;

/**
 * @program: RescueStation
 * @author: KaKa
 * @create: 2021-06-19 17:42
 **/
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
