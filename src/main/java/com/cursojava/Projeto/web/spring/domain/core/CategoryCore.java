package com.cursojava.Projeto.web.spring.domain.core;

import com.cursojava.Projeto.web.spring.adapter.in.request.CategoryRequest;
import com.cursojava.Projeto.web.spring.domain.mapper.CategoryMapper;
import com.cursojava.Projeto.web.spring.domain.model.CategoryModel;
import com.cursojava.Projeto.web.spring.domain.port.in.CategoryCorePort;
import com.cursojava.Projeto.web.spring.domain.port.out.CategoryServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryCore implements CategoryCorePort {
    private final CategoryMapper categoryMapper;
    private final CategoryServicePort categoryServicePort;

    @Override
    public List<CategoryRequest> findAll() {
        List<CategoryModel> categories = categoryServicePort.findAll();
        return categoryMapper.toRequest(categories);
    }

    @Override
    public CategoryRequest createdCategory(CategoryModel categoryModel) {
        CategoryModel result = categoryServicePort.createdCategory(categoryMapper.toEntity(categoryModel));
        return categoryMapper.toRequest(result);
    }

    @Override
    public CategoryRequest findById(String id) {
        CategoryModel categoryModel = categoryServicePort.findById(id);
        return categoryMapper.toRequest(categoryModel);
    }
}
