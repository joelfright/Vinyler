package com.sparta.joel.vinyler.general.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {

    @GetMapping("/admin-add")
    public String admin() {
        return "/admin/add-record";
    }

    @GetMapping("/admin-delete")
    public String adminDelete() {
        return "/admin/delete-record";
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
