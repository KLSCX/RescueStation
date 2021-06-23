package com.example.rescuestation.service.imp;

import com.example.rescuestation.entiy.Pet;
import com.example.rescuestation.mapper.PetMapper;
import com.example.rescuestation.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @program: RescueStation
 * @author: KaKa
 * @create: 2021-06-19 17:48
 **/

@Service
@Transactional
public class PetServiceImp implements PetService {

    @Autowired
    private PetMapper petMapper;
    @Override
    public  @ResponseBody
    List<Pet> findAll() {
        return petMapper.selectAll();

    }

    @Override
    public List<Pet> findCount(int page, int limit) {
        return petMapper.findCount(page,limit);
    }

    @Override
    public Integer deleteById(int id) {
        return  petMapper.deleteById(id);
    }

    @Override
    public Integer insertPet(Integer id, String petName, String petType, Integer sex, String pic, Integer state, Integer uid, String remark) {
        Integer res = petMapper.insertPet(id,petName,petType,sex,pic,state,uid,remark);
        return res;
    }

    @Override
    public Integer queryPet(Integer id) {
        Integer res = petMapper.queryPet(id);
        return res;
    }

    @Override
    public Integer updatePet(Integer id, String petName, String petType, Integer sex, String pic, Integer state, Integer uid, String remark) {
        Integer res = petMapper.updatePet(id,petName,petType,sex,pic,state,uid,remark);
        return res;
    }
}
