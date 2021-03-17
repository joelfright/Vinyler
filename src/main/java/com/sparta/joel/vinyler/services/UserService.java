package com.sparta.joel.vinyler.services;

import com.sparta.joel.vinyler.entities.UserEntity;
import com.sparta.joel.vinyler.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createUser(UserEntity userEntity){
        userRepository.save(userEntity);
    }

}
