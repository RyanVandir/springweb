package com.cursojava.Projeto.web.spring.adapter.out.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Transient;
import lombok.Data;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Data
@ToString
@Entity
public class CategoryEntity {
    @Id
    private String id;
    private String name;
    @JsonIgnore
    @ManyToMany(mappedBy = "categories")
    private Set<ProductEntity> products = new HashSet<>();
}
