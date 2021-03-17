package com.sparta.joel.vinyler.users.repositories;

import com.sparta.joel.vinyler.users.entities.UserEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Integer> {
}
