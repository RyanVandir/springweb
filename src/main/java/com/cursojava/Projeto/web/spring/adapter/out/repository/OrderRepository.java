package com.cursojava.Projeto.web.spring.adapter.out.repository;

import com.cursojava.Projeto.web.spring.adapter.out.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, String> {
}