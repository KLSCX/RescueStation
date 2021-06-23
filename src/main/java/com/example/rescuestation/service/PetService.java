package com.example.rescuestation.service;

import com.example.rescuestation.entiy.Pet;

import java.util.List;

public interface PetService {
    public List<Pet> findAll();

    List<Pet> findCount(int page, int limit);

    Integer deleteById(int id);

    Integer insertPet(Integer id, String petName, String petType, Integer sex, String pic, Integer state, Integer uid, String remark);

    Integer queryPet(Integer id);

    Integer updatePet(Integer id, String petName, String petType, Integer sex, String pic, Integer state, Integer uid, String remark);
}
