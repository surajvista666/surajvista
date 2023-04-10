package com.restdemo.demo.service;

import com.restdemo.demo.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UserService {
    public List<User> fetchAll() {
        int count = 1;
        ArrayList<User> users = new ArrayList<>(0);
        for (int i = 0; i < 6; i++) {
            User user = new User();
            user.setId(count);
            user.setName("Suraj Kumar Patel");
            user.setPhone(new Random().nextInt());
            user.setAge(24);
            user.setAddress("Chandpur");
            user.setEmail("surajvista666@gmail.com");
            user.setStatus("Available");
            count++;
            users.add(user);
        }
        return users;
    }

    public User addUser(User user) {
        user.setId(10);
        user.setName("Suraj");
        user.setPhone(46546);
        user.setAge(23);
        user.setAddress("Delhi");
        user.setEmail("fjal@gmail.com");
        user.setStatus("Available");

        return user;
    }

    //Update the User
    public User viewUser(Integer userId) {
        User u = new User();
        for (User user : fetchAll()) {
            if (user.getId() == userId) {
                u.setId(userId);
                u.setName(user.getName());
                u.setAge(user.getAge());
                u.setEmail(user.getEmail());
                u.setPhone(user.getPhone());
                u.setAddress(user.getAddress());
                u.setStatus(user.getStatus());
                break;
            }
        }
        return u;
    }

    // Delete the User
    public ArrayList<User> deleteUser(Integer userId) {
        ArrayList<User> u = new ArrayList<>();
        for (User user : fetchAll()) {
            if (user.getId() == userId) {
                this.fetchAll().remove(user);
            }
        }
        return u;
    }

    // Update the User
    public User updateUser(Integer userId) {
        User u = new User();
        for (User user : fetchAll()) {
            if (user.getId() == userId) {
                user.setId(userId);
                user.setName("Vishal");
                user.setAge(23);
                user.setEmail("abc@gmail.com");
                user.setPhone(535436);
                user.setAddress("Delhi");
                user.setStatus("Available");
                break;
            }
        }
        return u;
    }
}
