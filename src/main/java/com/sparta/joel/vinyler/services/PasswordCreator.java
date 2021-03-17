package com.sparta.joel.vinyler.services;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordCreator {

    static BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public static String encode(String password){
        return passwordEncoder.encode(password);
    }

}
