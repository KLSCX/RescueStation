package com.example.rescuestation.service;

public interface UserService {
    boolean queryUser(String name,String password);

    int InsertUser(String name, String password);
}
