package com.example.rescuestation.mapper;

import com.example.rescuestation.entiy.Pet;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PetMapper {
    public List<Pet> selectAll();
}
