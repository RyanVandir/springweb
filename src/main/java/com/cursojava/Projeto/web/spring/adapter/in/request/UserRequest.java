package com.cursojava.Projeto.web.spring.adapter.in.request;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserRequest {
    String id;
    String name;
    String email;
    String password;
    String phone;
}
