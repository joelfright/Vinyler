package com.sparta.joel.vinyler.users.services;

import com.sparta.joel.vinyler.users.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


}
