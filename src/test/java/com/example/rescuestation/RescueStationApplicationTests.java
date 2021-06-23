package com.example.rescuestation;

import com.example.rescuestation.entiy.Data;
import com.example.rescuestation.entiy.Pet;
import com.example.rescuestation.service.PetService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@SpringBootTest
class RescueStationApplicationTests {
    @Autowired
    private PetService petService;

    @Test
    void contextLoads() {
        List<Pet> petList = petService.findAll();
        for (Pet pet:
             petList) {
            System.out.println(pet.getId());
        }
    }



}
