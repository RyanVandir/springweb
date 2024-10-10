package com.cursojava.Projeto.web.spring.domain.core;

import com.cursojava.Projeto.web.spring.adapter.in.request.ProductRequest;
import com.cursojava.Projeto.web.spring.domain.mapper.ProductMapper;
import com.cursojava.Projeto.web.spring.domain.model.ProductModel;
import com.cursojava.Projeto.web.spring.domain.port.in.ProductCorePort;
import com.cursojava.Projeto.web.spring.domain.port.out.ProductServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductCore implements ProductCorePort {
    private final ProductMapper productMapper;
    private final ProductServicePort productServicePort;

    @Override
    public ProductRequest createdProduct(ProductModel productModel) {
        ProductModel result = productServicePort.createdProduct(productMapper.toEntity(productModel));
        return productMapper.toRequest(result);
    }

    @Override
    public List<ProductRequest> findAll() {
        List<ProductModel> list = productServicePort.findAll();
        return productMapper.toRequest(list);
    }

    @Override
    public ProductRequest findById(String id) {
        ProductModel model = productServicePort.findById(id);
        return productMapper.toRequest(model);
    }
}
