package com.cursojava.Projeto.web.spring.adapter.out.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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

    @ManyToOne
    @JoinColumn(name = "client_id")
    private UserEntity client;

}
