package com.cursojava.Projeto.web.spring.domain.port.out;

import com.cursojava.Projeto.web.spring.adapter.out.entity.UserEntity;
import com.cursojava.Projeto.web.spring.domain.model.UserModel;

import java.util.List;

public interface UserServicePort {

    List<UserModel> findAll();

    UserModel createdUser(UserEntity userEntity);

    UserModel findById(String id);
}
