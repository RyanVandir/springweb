package com.cursojava.Projeto.web.spring.adapter.out.repository;

import com.cursojava.Projeto.web.spring.adapter.out.entity.CategoryEntity;
import com.cursojava.Projeto.web.spring.adapter.out.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryEntity, String> {
}