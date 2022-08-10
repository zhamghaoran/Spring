package com.zhr.springhello.Controller;

import com.zhr.springhello.Service.UserService;

public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public void SaveUser() {
        userService.saveUser();
    }
}
