package com.cursojava.Projeto.web.spring.domain.port.in;

import com.cursojava.Projeto.web.spring.adapter.in.request.UserRequest;
import com.cursojava.Projeto.web.spring.domain.model.UserModel;

import java.util.List;

public interface UserCorePort {

    List<UserRequest> findAll();

    UserRequest createdUser(UserModel userModel);

    UserRequest findById(String id);

}
