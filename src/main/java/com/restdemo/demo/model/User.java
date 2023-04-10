package com.restdemo.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name = "User")
public class User {

    @Id
    private int id;
    private String name;
    private long phone;
    private int age;
    private String address;
    private String email;
    private String status;

    public int getId() {
        return id;
    }

    public void setId(Integer userId) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

}