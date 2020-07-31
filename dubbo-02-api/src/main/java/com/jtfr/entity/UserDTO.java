package com.jtfr.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * 用户信息 DTO
 */
@Data
public class UserDTO implements Serializable {

    private static final long serialVersionUID = -8822114416724926305L;
    /**
     * 用户编号
     */
    private Integer id;
    /**
     * 昵称
     */
    private String name;
    /**
     * 性别
     */
    private Integer gender;

}