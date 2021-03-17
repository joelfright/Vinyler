package com.sparta.joel.vinyler.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/admin")
    public String admin() {
        return "admin/add-user";
    }

    @GetMapping("/index")
    public String index() {
        return "/index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/access-denied")
    public String accessDenied(){
        return "/error/access-denied";
    }

}
