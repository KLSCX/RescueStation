package com.example.rescuestation.entiy;

import java.util.List;

/**
 * @program: RescueStation
 * @author: KaKa
 * @create: 2021-06-20 09:10
 **/


/*{
        "code": 0
        ,"msg": ""
        ,"count": 3000000
        ,"data": [{
        "id": "10001"
        ,"username": "杜甫"
        ,"email": "test@email.com"
        ,"sex": "男"
        ,"city": "浙江杭州"
        ,"sign": "点击此处，显示更多。当内容超出时，点击单元格会自动显示更多内容。"
        ,"experience": "116"
        ,"ip": "192.168.0.8"
        ,"logins": "108"
        ,"joinTime": "2016-10-14"
        }, {*/
public class Data {
    Integer code;
    String msg;
    Integer count;
    List<Pet> data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Pet> getData() {
        return data;
    }

    public void setData(List<Pet> data) {
        this.data = data;
    }
}
