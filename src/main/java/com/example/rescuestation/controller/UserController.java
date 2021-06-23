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
import java.util.Date;
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
        System.out.println("username:"+user.getUsername());//
        System.out.println("password:"+user.getPassword());//
        boolean result = userService.queryUser(user.getUsername(),user.getPassword());
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
        int rows = userService.InsertUser(user.getUsername(),user.getPassword());
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
    public Data list(int page, int limit){
        //获取全部学生信息
        List<Pet> pets = petService.findAll();
        //获取分页后的每页学生信息
        int start = (page-1)*limit;
        petService.findCount(start,limit);

        Data data1 = new Data();
        data1.setCode(0);
        data1.setMsg("");
        data1.setCount(pets.size());
        List<Pet> data = petService.findCount(start,limit);;
        data1.setData(data);
        return data1;
    }


    @RequestMapping("/list/deleteById")
    @ResponseBody
    public String deleteById(int id){
        System.out.println("调用了deleteById方法");

        Integer count = petService.deleteById(id);

        if(count == 0){
            return "error";
        }else if(count == 1){
            return "success";
        }else {
            System.out.println("程序出现错误，数据库修改异常");
            return "error";
        }
    }

    @RequestMapping("/pet/save")
    @ResponseBody
    public int add(Pet pet){


        Integer id = pet.getId();
        String petName = pet.getPetName();
        String petType = pet.getPetType();
        Integer sex = pet.getSex();
        String pic = pet.getPic();
        Integer state = pet.getState();
        Integer uid = pet.getUid();
        String remark = pet.getRemark();
        Integer count = petService.queryPet(id);

        Integer res;
        //查询不到id,说明是插入新数据
        if (count == 0){
            System.out.println("调用了add方法");
            res = petService.insertPet(id,petName,petType,sex,pic,state,uid,remark);
        }else {//查询到id，说明是更新数据
            System.out.println("调用了update方法");
            res = petService.updatePet(id,petName,petType,sex,pic,state,uid,remark);
        }

        if (res == 1){
            return 200;
        }
        return  0;
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
