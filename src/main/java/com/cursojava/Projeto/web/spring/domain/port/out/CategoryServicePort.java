package com.cursojava.Projeto.web.spring.domain.port.out;

import com.cursojava.Projeto.web.spring.adapter.out.entity.CategoryEntity;
import com.cursojava.Projeto.web.spring.domain.model.CategoryModel;

import java.util.List;

public interface CategoryServicePort {

    List<CategoryModel> findAll();

    CategoryModel createdCategory(CategoryEntity categoryEntity);

    CategoryModel findById(String id);
}
