package com.sparta.joel.vinyler.controllers;

import com.sparta.joel.vinyler.entities.UserEntity;
import com.sparta.joel.vinyler.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/registration")
    public UserEntity newUser(@RequestBody UserEntity userEntity){
        userService.createUser(userEntity);
        return userEntity;
    }

}
