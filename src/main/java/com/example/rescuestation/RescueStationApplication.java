package com.example.rescuestation;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.rescuestation.mapper")
public class RescueStationApplication {

    public static void main(String[] args) {
        SpringApplication.run(RescueStationApplication.class, args);
    }

}
