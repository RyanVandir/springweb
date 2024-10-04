package com.cursojava.Projeto.web.spring.adapter.out.entity;

import com.cursojava.Projeto.web.spring.adapter.out.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;

import java.time.Instant;

@Data
@ToString
@Entity
public class OrderEntity {
    @Id
    private String id;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'")
    private Instant moment;

    private OrderStatus orderStatus;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "client_id")
    private UserEntity client;
}
