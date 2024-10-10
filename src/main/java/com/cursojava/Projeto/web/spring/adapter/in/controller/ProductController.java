package com.cursojava.Projeto.web.spring.adapter.in.controller;

import com.cursojava.Projeto.web.spring.adapter.in.request.ProductRequest;
import com.cursojava.Projeto.web.spring.domain.mapper.ProductMapper;
import com.cursojava.Projeto.web.spring.domain.port.in.ProductCorePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductMapper productMapper;
    private final ProductCorePort productCorePort;

    @PostMapping("{idCategory}")
    public ResponseEntity<ProductRequest> createdProduct(@RequestBody ProductRequest productRequest) {
        ProductRequest response = productCorePort.createdProduct(productMapper.toModel(productRequest));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public List<ProductRequest> findAll() {
        return productCorePort.findAll();
    }

    @GetMapping("/{id}")
    public ProductRequest findById(@PathVariable String id) {
        return productCorePort.findById(id);
    }
}
