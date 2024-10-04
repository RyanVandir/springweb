package com.cursojava.Projeto.web.spring.adapter.out.service;

import com.cursojava.Projeto.web.spring.adapter.out.entity.CategoryEntity;
import com.cursojava.Projeto.web.spring.adapter.out.repository.CategoryRepository;
import com.cursojava.Projeto.web.spring.domain.mapper.CategoryMapper;
import com.cursojava.Projeto.web.spring.domain.model.CategoryModel;
import com.cursojava.Projeto.web.spring.domain.port.out.CategoryServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService implements CategoryServicePort {
    private final CategoryMapper categoryMapper;
    private final CategoryRepository categoryRepository;

    @Override
    public List<CategoryModel> findAll() {
        List<CategoryEntity> categories = categoryRepository.findAll();
        return categoryMapper.toModel(categories);
    }

    @Override
    public CategoryModel createdCategory(CategoryEntity categoryEntity) {
        return categoryMapper.toModel(categoryRepository.save(categoryEntity));
    }

    @Override
    public CategoryModel findById(String id) {
        Optional<CategoryEntity> categoryEntity = categoryRepository.findById(id);
        return categoryMapper.toModel(categoryEntity.get());
    }
}
