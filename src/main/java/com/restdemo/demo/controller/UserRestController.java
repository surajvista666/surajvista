package com.restdemo.demo.controller;

import com.restdemo.demo.service.UserService;
import com.restdemo.demo.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    @GetMapping("/users/view-all-user")
    List<User> Users() {
        return userService.fetchAll();
    }

    @PostMapping("users/add-user")
    User addUser(User user) {
        return userService.addUser(user);
    }

    @GetMapping("users/user/{userId}")
    User viewUser(@PathVariable Integer userId) {
        return this.userService.viewUser(userId);
    }

    @DeleteMapping("users/remove/{userId}")
    ArrayList<User> deleteUser(@PathVariable Integer userId) {
        return this.userService.deleteUser(userId);
    }

    @PutMapping("users/update/{userId}")
    User updateUser(@PathVariable Integer userId) {
        return this.userService.updateUser(userId);
    }

}
