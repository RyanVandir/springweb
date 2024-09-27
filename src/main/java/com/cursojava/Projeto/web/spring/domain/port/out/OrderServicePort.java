package com.cursojava.Projeto.web.spring.domain.port.out;

import com.cursojava.Projeto.web.spring.adapter.out.entity.OrderEntity;
import com.cursojava.Projeto.web.spring.domain.model.OrderModel;

import java.util.List;

public interface OrderServicePort {

    List<OrderModel> findAll();

    OrderModel createdUser(OrderEntity orderEntity);

    OrderModel findById(String id);
}
