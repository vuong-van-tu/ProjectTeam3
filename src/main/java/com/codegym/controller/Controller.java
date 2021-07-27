package com.codegym.controller;

import com.codegym.model.Role;
import com.codegym.model.User;
import com.codegym.service.User.IUserService;
import com.codegym.service.User.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.stereotype.Controller
@RequestMapping
public class Controller {
    @Autowired
    UserService userService;


    @GetMapping("/user")
    public String list(Model model) {
        List<User> userList = (List<User>) userService.findAll();
        List<Role> roles = userService.findByUser(userList);
        model.addAttribute("listRole", roles);
        model.addAttribute("listUser", userList);
        return "/user/list";
    }
}
