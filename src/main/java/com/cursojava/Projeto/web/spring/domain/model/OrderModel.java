package com.cursojava.Projeto.web.spring.domain.model;

import lombok.Data;
import lombok.ToString;

import java.time.Instant;

@Data
@ToString
public class OrderModel {
    private String id;
    private Instant moment;
}
