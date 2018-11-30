package com.example.shiro.controller;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @author szkingdom_nongky
 * @date 2018.11.30
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("/view")
    @RequiresPermissions("user:list")
    public String userInfo() {
        return "userList";
    }

    @RequestMapping("/userAdd")
    @RequiresPermissions("user:add")
    public String userInfoAdd() {
        return "userAdd";
    }

    @RequestMapping("/userDel")
    @RequiresPermissions("user:del")
    public String userDel() {
        return "userDel";
    }
}
