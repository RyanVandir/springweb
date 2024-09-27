package com.cursojava.Projeto.web.spring.domain.mapper;

import com.cursojava.Projeto.web.spring.adapter.in.request.OrderRequest;
import com.cursojava.Projeto.web.spring.adapter.out.entity.OrderEntity;
import com.cursojava.Projeto.web.spring.domain.model.OrderModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface OrderMapper {
    OrderRequest toRequest(OrderModel orderModel);

    OrderModel toModel(OrderRequest orderRequest);

    OrderEntity toEntity(OrderModel orderModel);

    OrderModel toModel(OrderEntity orderEntity);

    List<OrderRequest> toRequest(List<OrderModel> orderModels);

    List<OrderModel> toModel(List<OrderEntity> orderEntities);
}
