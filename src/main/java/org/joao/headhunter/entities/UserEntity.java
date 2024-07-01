package org.joao.headhunter.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "UserEntity")
public class UserEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
