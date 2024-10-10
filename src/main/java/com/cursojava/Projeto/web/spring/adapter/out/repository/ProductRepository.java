package com.cursojava.Projeto.web.spring.adapter.out.repository;

import com.cursojava.Projeto.web.spring.adapter.out.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, String> {
}