package com.example.rescuestation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * @program: RescueStation
 * @author: KaKa
 * @create: 2021-06-17 17:41
 **/
//使用WebMvcConfigurerAdapter可以来扩展springmvc的功能
@Configuration
//@EnableWebMvc 不要接管Springmvc
public class MyMvcConfig extends WebMvcConfigurerAdapter {

    //所有的WebMvcConfigurer组件都会一起起作用
    //@Bean 将组件注册在容器中
    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        WebMvcConfigurer adapter = new WebMvcConfigurer(){
            public void addViewControllers(ViewControllerRegistry registry){
                registry.addViewController("/").setViewName("/html/preLogin");
                registry.addViewController("/index.html").setViewName("/html/preLogin");
            }
        };
        return adapter;
    }

}
