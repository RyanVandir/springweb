package com.cursojava.Projeto.web.spring.adapter.out.repository;

import com.cursojava.Projeto.web.spring.adapter.out.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {
}