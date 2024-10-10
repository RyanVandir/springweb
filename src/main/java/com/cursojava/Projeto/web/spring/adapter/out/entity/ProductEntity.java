package com.cursojava.Projeto.web.spring.adapter.out.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.util.HashSet;
import java.util.Set;

@Data
@ToString
@Entity
public class ProductEntity {
    @Id
    private String id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;
    @ManyToMany
    @JoinTable(name = "product_category",
            joinColumns = @JoinColumn(name = "product_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private Set<CategoryEntity> categories = new HashSet<>();

}
