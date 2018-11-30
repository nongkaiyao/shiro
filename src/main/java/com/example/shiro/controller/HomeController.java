package com.example.shiro.controller;

import com.example.shiro.Entity.LoginResult;
import com.example.shiro.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author szkingdom_nongky
 * @date 2018.11.29
 */
@Controller
public class HomeController {
    @Resource
    private LoginService loginService;

    @GetMapping({"/","index"})
    public String index() {
        return "index";
    }

    @RequestMapping("/403")
    public String unauthorizedRole() {
        System.out.println("--------没有权限--------");
        return "user/403";
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String login() {
        return "user/login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String login(Map<String, Object> map, HttpServletRequest request) {
        System.out.println("login");
        String userName = request.getParameter("username");
        String password = request.getParameter("password");
        LoginResult result = loginService.login(userName, password);
        if(result.getLogin()) {
            return "index";
        } else {
            map.put("userName", userName);
            map.put("msg", result.getResult());
            return "user/login";
        }

    }

    @RequestMapping()
    public String logout(HttpSession session) {
        loginService.logout();
        return "user/login";
    }
}
