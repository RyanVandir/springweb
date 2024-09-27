package com.cursojava.Projeto.web.spring.adapter.out.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class UserEntity {
    @Id
    String id;
    String name;
    String email;
    String password;
    String phone;
}