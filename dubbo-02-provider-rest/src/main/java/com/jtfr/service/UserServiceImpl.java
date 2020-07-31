package com.jtfr.service;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.jtfr.entity.UserAddDTO;
import com.jtfr.entity.UserDTO;

@org.apache.dubbo.config.annotation.Service(version = "1.0.0", protocol = {"dubbo", "rest"})
@Path("/user")
public class UserServiceImpl implements UserService {

    @Override
    @GET
    @Path("/get")
    @Produces
    public UserDTO get(@QueryParam("id") Integer id) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(id);
        userDTO.setName("没有昵称：" + id);
        userDTO.setGender(id % 2 + 1); // 1 - 男；2 - 女
        return userDTO;
    }

    @Override
    @POST
    @Path("/add")
    @Consumes(MediaType.APPLICATION_JSON)
    public Integer add(UserAddDTO addDTO) {
        return (int)(System.currentTimeMillis() / 1000); // 嘿嘿，随便返回一个 id
    }

}