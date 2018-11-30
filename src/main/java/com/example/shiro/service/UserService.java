package com.example.shiro.service;

import com.example.shiro.Entity.User;

/**
 * @author szkingdom_nongky
 * @date 2018.11.29
 */
public interface UserService {
    User findByUserName(String userName);
}
