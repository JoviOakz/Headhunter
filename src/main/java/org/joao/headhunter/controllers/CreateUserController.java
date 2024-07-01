package org.joao.headhunter.controllers;

import org.joao.headhunter.entities.UserEntity;
import org.joao.headhunter.services.CreateUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreateUserController {

    @Autowired
    CreateUserService repo;

    @PostMapping("create")
    public String postMethodUser(@RequestBody UserEntity user) {
        return repo.save(user);
    }
}
