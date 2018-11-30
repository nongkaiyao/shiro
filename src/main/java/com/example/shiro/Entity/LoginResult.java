package com.example.shiro.Entity;

/**
 * @author szkingdom_nongky
 * @date 2018.11.29
 */
public class LoginResult {
    private Boolean isLogin = false;
    private String result;

    public Boolean getLogin() {
        return isLogin;
    }

    public void setLogin(Boolean login) {
        isLogin = login;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }
}
