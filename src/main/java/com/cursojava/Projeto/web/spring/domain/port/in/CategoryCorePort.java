package com.cursojava.Projeto.web.spring.domain.port.in;

import com.cursojava.Projeto.web.spring.adapter.in.request.CategoryRequest;
import com.cursojava.Projeto.web.spring.domain.model.CategoryModel;

import java.util.List;

public interface CategoryCorePort {

    List<CategoryRequest> findAll();

    CategoryRequest createdCategory(CategoryModel categoryModel);

    CategoryRequest findById(String id);

}
