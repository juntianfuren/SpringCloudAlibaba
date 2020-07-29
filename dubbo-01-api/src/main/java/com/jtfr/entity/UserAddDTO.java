package com.jtfr.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * 用户添加 DTO
 */
@Data
public class UserAddDTO implements Serializable {

    private static final long serialVersionUID = 516405506398065369L;
    /**
     * 昵称
     */
    private String name;
    /**
     * 性别
     */
    private Integer gender;
    
}