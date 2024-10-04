package com.cursojava.Projeto.web.spring.adapter.in.request;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class CategoryRequest {
    private String id;
    private String name;
}
