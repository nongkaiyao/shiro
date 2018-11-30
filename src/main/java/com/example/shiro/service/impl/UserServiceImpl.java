package com.example.shiro.service.impl;

import com.example.shiro.Entity.User;
import com.example.shiro.dao.UserRepositry;
import com.example.shiro.service.UserService;

import javax.annotation.Resource;

/**
 * @author szkingdom_nongky
 * @date 2018.11.29
 */
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepositry userRepositry;

    @Override
    public User findByUserName(String userName) {
        return userRepositry.findByUserName(userName);
    }
}
