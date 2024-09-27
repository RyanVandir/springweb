package com.cursojava.Projeto.web.spring.domain.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserModel {
    String id;
    String name;
    String email;
    String password;
    String phone;
}