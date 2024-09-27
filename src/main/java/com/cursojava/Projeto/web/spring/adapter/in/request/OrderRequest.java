package com.cursojava.Projeto.web.spring.adapter.in.request;

import lombok.Data;
import lombok.ToString;

import java.time.Instant;

@Data
@ToString
public class OrderRequest {
    private String id;
    private Instant moment;
}
