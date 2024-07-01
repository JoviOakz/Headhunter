package org.joao.headhunter.repositories;

import org.joao.headhunter.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CreateUserJPARepository extends JpaRepository<UserEntity, Long> {

    List<UserEntity> findByNameContaining(String name);
    List<UserEntity> findByEmail(String email);
}
