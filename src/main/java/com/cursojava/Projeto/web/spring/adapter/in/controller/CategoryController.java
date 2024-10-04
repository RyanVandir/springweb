package com.cursojava.Projeto.web.spring.adapter.in.controller;

import com.cursojava.Projeto.web.spring.adapter.in.request.CategoryRequest;
import com.cursojava.Projeto.web.spring.domain.mapper.CategoryMapper;
import com.cursojava.Projeto.web.spring.domain.port.in.CategoryCorePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("categories")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryMapper categoryMapper;
    private final CategoryCorePort categoryCorePort;

    @PostMapping
    public ResponseEntity<CategoryRequest> createdCategory(@RequestBody CategoryRequest categoryRequest) {
        CategoryRequest response = categoryCorePort.createdCategory(categoryMapper.toModel(categoryRequest));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public List<CategoryRequest> findAll() {
        return categoryCorePort.findAll();
    }

    @GetMapping("/{id}")
    public CategoryRequest findById(@PathVariable String id) {
        return categoryCorePort.findById(id);
    }
}
