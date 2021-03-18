package com.sparta.joel.vinyler.general.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/admin/add/add-record")
    public String admin() {
        return "/admin/add/add-record";
    }

    @GetMapping("/admin/delete/delete-record")
    public String adminDelete() {
        return "/admin/delete/delete-record";
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
