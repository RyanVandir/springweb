package com.cursojava.Projeto.web.spring.adapter.in.request;

import jakarta.persistence.Id;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ProductRequest {
    @Id
    private String id;
    private String name;
    private String description;
    private Double price;
    private String imgUrl;
}
