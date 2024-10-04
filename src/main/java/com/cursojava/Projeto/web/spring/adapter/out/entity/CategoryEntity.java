package com.cursojava.Projeto.web.spring.adapter.out.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@Entity
public class CategoryEntity {
    @Id
    private String id;
    private String name;
}
