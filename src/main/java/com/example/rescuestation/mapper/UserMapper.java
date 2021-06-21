package com.example.rescuestation.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    Integer selectUser(String name, String password);

    Integer insertUser(String name, String password);
}
