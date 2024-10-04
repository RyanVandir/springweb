package com.cursojava.Projeto.web.spring.domain.mapper;

import com.cursojava.Projeto.web.spring.adapter.in.request.CategoryRequest;
import com.cursojava.Projeto.web.spring.adapter.out.entity.CategoryEntity;
import com.cursojava.Projeto.web.spring.domain.model.CategoryModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface CategoryMapper {
    CategoryRequest toRequest(CategoryModel categoryModel);

    CategoryModel toModel(CategoryRequest categoryRequest);

    CategoryEntity toEntity(CategoryModel categoryModel);

    CategoryModel toModel(CategoryEntity categoryEntity);

    List<CategoryRequest> toRequest(List<CategoryModel> categoryModels);

    List<CategoryModel> toModel(List<CategoryEntity> categoryEntities);
}
