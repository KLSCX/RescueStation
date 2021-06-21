package com.example.rescuestation.service.imp;

import com.example.rescuestation.mapper.UserMapper;
import com.example.rescuestation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @program: RescueStation
 * @author: KaKa
 * @create: 2021-06-17 08:17
 **/

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean queryUser(String name, String password) {
        Integer result = userMapper.selectUser(name,password);
        if (result == 0){
            return false;
        }else {
            return true;
        }
    }

    @Override
    public int InsertUser(String name, String password) {
        Integer result = 0;
        Integer count = userMapper.selectUser(name,password);
        if (count == 0){

            result = userMapper.insertUser(name,password);

        }else {

            result = 0;
        }

        return result;
    }
}
