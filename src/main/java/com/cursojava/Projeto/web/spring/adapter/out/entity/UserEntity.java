package com.cursojava.Projeto.web.spring.adapter.out.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class UserEntity {
    @Id
    private String id;
    private String name;
    private String email;
    private String password;
    private String phone;

    @JsonIgnore
    @OneToMany(mappedBy = "client")
    private List<OrderEntity> orders = new ArrayList<>();
}