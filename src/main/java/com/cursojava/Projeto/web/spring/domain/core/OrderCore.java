package com.cursojava.Projeto.web.spring.domain.core;

import com.cursojava.Projeto.web.spring.adapter.in.request.OrderRequest;
import com.cursojava.Projeto.web.spring.adapter.out.entity.OrderEntity;
import com.cursojava.Projeto.web.spring.domain.mapper.OrderMapper;
import com.cursojava.Projeto.web.spring.domain.model.OrderModel;
import com.cursojava.Projeto.web.spring.domain.port.in.OrderCorePort;
import com.cursojava.Projeto.web.spring.domain.port.in.UserCorePort;
import com.cursojava.Projeto.web.spring.domain.port.out.OrderServicePort;
import com.cursojava.Projeto.web.spring.domain.port.out.UserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class OrderCore implements OrderCorePort {
    private final OrderServicePort orderServicePort;
    private final OrderMapper orderMapper;
    private final UserServicePort userServicePort;

    @Override
    public List<OrderRequest> findAll() {
        List<OrderModel> orders = orderServicePort.findAll();
        return orderMapper.toRequest(orders);
    }

    @Override
    public OrderRequest createdUser(OrderModel orderModel, String idUser) {
        orderModel.setClient(userServicePort.findById(idUser));
        OrderModel result = orderServicePort.createdUser(orderMapper.toEntity(orderModel));
        return orderMapper.toRequest(result);
    }

    @Override
    public OrderRequest findById(String id) {
        OrderModel orderModel = orderServicePort.findById(id);
        return orderMapper.toRequest(orderModel);
    }
}
