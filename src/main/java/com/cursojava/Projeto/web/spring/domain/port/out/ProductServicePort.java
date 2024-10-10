package com.cursojava.Projeto.web.spring.domain.port.out;

import com.cursojava.Projeto.web.spring.adapter.out.entity.ProductEntity;
import com.cursojava.Projeto.web.spring.domain.model.ProductModel;

import java.util.List;

public interface ProductServicePort {
    ProductModel createdProduct(ProductEntity productEntity);

    List<ProductModel> findAll();

    ProductModel findById(String id);

}
