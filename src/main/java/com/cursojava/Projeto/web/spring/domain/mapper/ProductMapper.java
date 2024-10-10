package com.cursojava.Projeto.web.spring.domain.mapper;

import com.cursojava.Projeto.web.spring.adapter.in.request.ProductRequest;
import com.cursojava.Projeto.web.spring.adapter.out.entity.ProductEntity;
import com.cursojava.Projeto.web.spring.domain.model.ProductModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ProductMapper {
    ProductRequest toRequest(ProductModel productModel);

    ProductModel toModel(ProductRequest productRequest);

    ProductEntity toEntity(ProductModel productModel);

    ProductModel toModel(ProductEntity productEntity);

    List<ProductRequest> toRequest(List<ProductModel> productModels);

    List<ProductModel> toModel(List<ProductEntity> productEntities);
}
