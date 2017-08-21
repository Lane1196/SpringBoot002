package com.controller;

import com.entity.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Wzj on 2017/8/20 0020.
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/save")
    public void save(@Validated User user) {
        userService.save(user);
    }

    @RequestMapping("/update")
    public User update(@Validated User user) {
        return userService.update(user);
    }

    @RequestMapping("/get")
    public User getById(Long id) {
        if (null == id) {
            return null;
        }
        return userService.getById(id);
    }

    @RequestMapping("/remove")
    public void removeById(Long id) {
        if (null == id) {
            return;
        }

        userService.removeById(id);
    }

    @RequestMapping("/all")
    public List<User> findAll() {
        return userService.findAll();
    }

}
