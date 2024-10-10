package com.cursojava.Projeto.web.spring.domain.port.in;

import com.cursojava.Projeto.web.spring.adapter.in.request.ProductRequest;
import com.cursojava.Projeto.web.spring.domain.model.ProductModel;

import java.util.List;

public interface ProductCorePort {
    ProductRequest createdProduct(ProductModel productModel);

    public List<ProductRequest> findAll();

    public ProductRequest findById(String id);

}
