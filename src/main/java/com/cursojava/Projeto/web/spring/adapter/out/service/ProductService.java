package com.cursojava.Projeto.web.spring.adapter.out.service;

import com.cursojava.Projeto.web.spring.adapter.out.entity.ProductEntity;
import com.cursojava.Projeto.web.spring.adapter.out.repository.ProductRepository;
import com.cursojava.Projeto.web.spring.domain.mapper.ProductMapper;
import com.cursojava.Projeto.web.spring.domain.model.ProductModel;
import com.cursojava.Projeto.web.spring.domain.port.out.ProductServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ProductService implements ProductServicePort {
    private final ProductMapper productMapper;
    private final ProductRepository productRepository;

    @Override
    public ProductModel createdProduct(ProductEntity productEntity) {
        return productMapper.toModel(productRepository.save(productEntity));
    }

    @Override
    public List<ProductModel> findAll() {
        List<ProductEntity> list = productRepository.findAll();
        return productMapper.toModel(list);
    }

    @Override
    public ProductModel findById(String id) {
        Optional<ProductEntity> productEntity = productRepository.findById(id);
        return productMapper.toModel(productEntity.get());
    }
}
