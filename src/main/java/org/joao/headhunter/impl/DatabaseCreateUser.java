package org.joao.headhunter.impl;

import org.joao.headhunter.entities.UserEntity;
import org.joao.headhunter.repositories.CreateUserJPARepository;
import org.joao.headhunter.services.CreateUserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DatabaseCreateUser implements CreateUserService {

    @Autowired
    CreateUserJPARepository repo;

    @Override
    public String save(UserEntity user) {
        if (!validateEmail(user))
            return "Erro! Email precisa de '@' ou Email já foi cadastrado!";

        if (!validateName(user))
            return "Erro! Este Username já está em uso ou não está dentro dos requerimentos!";

        if (!validatePassword(user))
            return "Erro! Password precisa atender aos requisitos!";

        repo.save(user);
        return "Usuário cadastado com sucesso!";
    }

    @Override
    public List<UserEntity> findByName(String name) {
        return repo.findByNameContaining(name);
    }

    @Override
    public List<UserEntity> findByEmail(String email) {
        return repo.findByEmail(email);
    }

    public Boolean validateName(UserEntity user) {
        String current_name = user.getName();
        List<UserEntity> db_name = findByName(current_name);

        if (current_name.length() < 4)
            return false;

        if (!db_name.isEmpty())
            return false;

        return true;
    }

    public Boolean validateEmail(UserEntity user) {
        String current_email = user.getEmail();
        List<UserEntity> db_email = findByEmail(current_email);

        if (current_email.length() < 4)
            return false;

        if (!current_email.contains("@"))
            return false;

        if (!db_email.isEmpty())
            return false;

        return true;
    }

    public Boolean validatePassword(UserEntity user) {
        String current_password = user.getPassword();
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasNumber = false;

        if (current_password.length() < 8)
            return false;

        for (int i = 0; i < current_password.length(); i++) {
            if (Character.isUpperCase(current_password.charAt(i)))
                hasUpper = true;

            if (Character.isLowerCase(current_password.charAt(i)))
                hasLower = true;

            if (!Character.isDigit(current_password.charAt(i)))
                hasNumber = true;
        }

        if (!hasUpper)
            return false;
        else if (!hasLower)
            return false;
        else return hasNumber;
    }
}
