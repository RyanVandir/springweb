package com.cursojava.Projeto.web.spring.adapter.in.request;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class UserRequest {
    private String id;
    private String name;
    private String email;
    private String password;
    private String phone;
}
