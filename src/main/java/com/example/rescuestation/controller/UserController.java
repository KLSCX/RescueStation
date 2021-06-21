package com.example.rescuestation.controller;

import com.example.rescuestation.entiy.Data;
import com.example.rescuestation.entiy.Pet;
import com.example.rescuestation.entiy.User;
import com.example.rescuestation.mapper.UserMapper;
import com.example.rescuestation.service.PetService;
import com.example.rescuestation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @program: RescueStation
 * @author: KaKa
 * @create: 2021-06-17 08:08
 **/
@Controller

public class UserController {

    @Resource
    private UserService userService;

    /*
     * 用户登录
     * */
    @RequestMapping("/login")
    @ResponseBody
    public String login(User user, Model model, HttpSession session){
    /*    System.out.println("username:"+user.getName());//
        System.out.println("password:"+user.getPassword());//*/
        boolean result = userService.queryUser(user.getName(),user.getPassword());
        if (result){
            return  "success";
        }else {
            return  "error";
        }

    }

//    用户登录
    @RequestMapping("/register")
    @ResponseBody
    public String register(User user, HttpSession session){
        System.out.println("被调用了一次");
        int rows = userService.InsertUser(user.getName(),user.getPassword());
        System.out.println("row"+rows);
        if(rows==0){
            return "fail";
        }else {
            return "success";
        }
        //session.setAttribute("user",user);
    }

    @Autowired
    private PetService petService;

    @RequestMapping("/list")
    @ResponseBody
    public Data list(){
        Data data1 = new Data();
        data1.setCode(0);
        data1.setMsg("");
        data1.setCount(100);
        List<Pet> data = petService.findAll();

        data1.setData(data);
        
        return data1;
    }

}

        /*User loginUser = usersMapper.selectUser(q);
        if(null == loginUser){
            return "error";
        }
        else{
            session.setAttribute("user",loginUser);
            QueryWrapper qw = new QueryWrapper();
            qw.eq("id",loginUser.getPid());
            Pet pet = petMapper.selectOne(qw);

            System.out.println("领养的宠物"+pet);
            if(pet != null){
                System.out.println("pname"+pet.getPetName());
                session.setAttribute("pname",pet.getPetName());
            }

//            session.setAttribute("state",state);
//            model.addAttribute("state",state);
            return "success";*/
