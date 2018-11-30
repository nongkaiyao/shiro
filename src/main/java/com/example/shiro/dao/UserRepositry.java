package com.example.shiro.dao;

import com.example.shiro.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author szkingdom_nongky
 * @date 2018.11.29
 */
public interface UserRepositry extends JpaRepository<User, Integer> {
    User findByUserName(String userName);
}
