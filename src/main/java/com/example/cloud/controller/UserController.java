package com.example.cloud.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {

    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/users")
    public List<String> getListUsers() {
        List<String > users = new ArrayList<>();
        users.add("User1");
        return users;
    }
}
