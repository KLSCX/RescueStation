package com.example.rescuestation.mapper;

import com.example.rescuestation.entiy.Pet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PetMapper {
    public List<Pet> selectAll();

    List<Pet> findCount(int page,int limit);

    Integer deleteById(int id);

    Integer insertPet(Integer id, String petName, String petType, Integer sex, String pic, Integer state, Integer uid, String remark);

    Integer queryPet(Integer id);

    Integer updatePet(Integer id, String petName, String petType, Integer sex, String pic, Integer state, Integer uid, String remark);
}
