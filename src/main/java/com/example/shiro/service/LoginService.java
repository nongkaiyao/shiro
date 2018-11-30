package com.example.shiro.service;

import com.example.shiro.Entity.LoginResult;
import com.example.shiro.Entity.User;

/**
 * @author szkingdom_nongky
 * @date 2018.11.29
 */
public interface LoginService {
   LoginResult login(String userName, String password);
   void logout();
}
