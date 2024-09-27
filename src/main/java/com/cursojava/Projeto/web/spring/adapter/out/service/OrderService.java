package com.cursojava.Projeto.web.spring.adapter.out.service;

import com.cursojava.Projeto.web.spring.adapter.out.entity.OrderEntity;
import com.cursojava.Projeto.web.spring.adapter.out.repository.OrderRepository;
import com.cursojava.Projeto.web.spring.domain.mapper.OrderMapper;
import com.cursojava.Projeto.web.spring.domain.model.OrderModel;
import com.cursojava.Projeto.web.spring.domain.port.out.OrderServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class OrderService implements OrderServicePort {
    private final OrderRepository orderRepository;
    private final OrderMapper orderMapper;

    @Override
    public List<OrderModel> findAll() {
        List<OrderEntity> orders = orderRepository.findAll();
        return orderMapper.toModel(orders);
    }

    @Override
    public OrderModel createdUser(OrderEntity orderEntity) {
        return orderMapper.toModel(orderRepository.save(orderEntity));
    }

    @Override
    public OrderModel findById(String id) {
       Optional<OrderEntity> orderEntity = orderRepository.findById(id);
        return orderMapper.toModel(orderEntity.get());
    }

}
