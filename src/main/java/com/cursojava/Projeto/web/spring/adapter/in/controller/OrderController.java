package com.cursojava.Projeto.web.spring.adapter.in.controller;

import com.cursojava.Projeto.web.spring.adapter.in.request.OrderRequest;
import com.cursojava.Projeto.web.spring.domain.mapper.OrderMapper;
import com.cursojava.Projeto.web.spring.domain.port.in.OrderCorePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderCorePort orderCorePort;
    private final OrderMapper orderMapper;

    @PostMapping
    public ResponseEntity<OrderRequest> createdUser(@RequestBody OrderRequest orderRequest) {
        OrderRequest response = orderCorePort.createdUser(orderMapper.toModel(orderRequest));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public List<OrderRequest> findAll() {
        return orderCorePort.findAll();
    }

    @GetMapping("/{id}")
    public OrderRequest findById(@PathVariable String id) {
        return orderCorePort.findById(id);
    }
}
