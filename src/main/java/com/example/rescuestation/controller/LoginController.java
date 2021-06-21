package com.example.rescuestation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: RescueStation
 * @author: KaKa
 * @create: 2021-06-17 15:04
 **/

@Controller
@RequestMapping("/")
public class LoginController {


    //前台
    @RequestMapping("toLogin")
    public String login() {
        return "html/login";
    }

    @RequestMapping("toRegister")
    public String register() {
        return "html/register";
    }

    @RequestMapping("adminLogin")
    public String adminRegister() {
        return "html/adminLogin";
    }

    @RequestMapping("test")
    public String test() {
        return "html/preLogin";
    }

    @RequestMapping("table")
    public String table(){ return "html/table";}

    @RequestMapping("toPetEncyclopedia")
    public String petEncyclopedia(){
        return "html/petEncyclopedia";
    }

    @RequestMapping("toWishingWall")
    public String wishingWall(){
        return "html/wishingWall.html";
    }

    @RequestMapping("toAdoptionNotice")
    public String adoptionNotice(){
        return "html/adoptionNotice";
    }

 /*   @RequestMapping("index")
    public String index() {
        return "html/index";
    }*/


    @RequestMapping("/nav")
    public String nav(Model model,String role) {

        //System.out.println("nav:" + role);
        if ("user".equals(role)) {
            model.addAttribute("login","user");
            return "redirect:/toLogin";
        } else {
            model.addAttribute("login","admin");
            return "redirect:/adminLogin";
        }
    }


}
