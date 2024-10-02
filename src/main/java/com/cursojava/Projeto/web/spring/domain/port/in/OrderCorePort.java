package com.cursojava.Projeto.web.spring.domain.port.in;

import com.cursojava.Projeto.web.spring.adapter.in.request.OrderRequest;
import com.cursojava.Projeto.web.spring.domain.model.OrderModel;

import java.util.List;

public interface OrderCorePort {

    List<OrderRequest> findAll();

    OrderRequest createdUser(OrderModel orderModel, String idUser);

    OrderRequest findById(String id);
}
