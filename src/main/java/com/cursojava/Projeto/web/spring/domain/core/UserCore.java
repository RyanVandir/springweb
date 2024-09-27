package com.cursojava.Projeto.web.spring.domain.core;

import com.cursojava.Projeto.web.spring.adapter.in.request.UserRequest;
import com.cursojava.Projeto.web.spring.domain.mapper.UserMapper;
import com.cursojava.Projeto.web.spring.domain.model.UserModel;
import com.cursojava.Projeto.web.spring.domain.port.in.UserCorePort;
import com.cursojava.Projeto.web.spring.domain.port.out.UserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserCore implements UserCorePort {
    private final UserServicePort userServicePort;
    private final UserMapper userMapper;

    @Override
    public List<UserRequest> findAll() {
        List<UserModel> users = userServicePort.findAll();
        return userMapper.toRequest(users);
    }

    @Override
    public UserRequest createdUser(UserModel userModel) {
        UserModel result = userServicePort.createdUser(userMapper.toEntity(userModel));
        return userMapper.toRequest(result);
    }

    @Override
    public UserRequest findById(String id) {
        UserModel userModel = userServicePort.findById(id);
        return userMapper.toRequest(userModel);
    }
}