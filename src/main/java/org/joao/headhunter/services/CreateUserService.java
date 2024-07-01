package org.joao.headhunter.services;

import org.joao.headhunter.entities.UserEntity;

import java.util.List;

public interface CreateUserService {

    String save(UserEntity user);
    List<UserEntity> findByName(String name);
    List<UserEntity> findByEmail(String email);
}
