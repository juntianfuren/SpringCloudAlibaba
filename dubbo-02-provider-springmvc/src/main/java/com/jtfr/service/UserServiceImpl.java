package com.jtfr.service;

import com.jtfr.entity.UserAddDTO;
import com.jtfr.entity.UserDTO;

@org.apache.dubbo.config.annotation.Service(protocol = "dubbo", version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO get(Integer id) {
        UserDTO dto = new UserDTO();
        dto.setId(id);
        dto.setName("没有昵称：" + id);
        dto.setGender(id % 2 + 1);// 1 - 男；2 - 女
        return dto;
                
    }

    @Override
    public Integer add(UserAddDTO addDTO) {
        return (int) (System.currentTimeMillis() / 1000); // 嘿嘿，随便返回一个 id
    }

}