package com.cursojava.Projeto.web.spring.adapter.out.service;

import com.cursojava.Projeto.web.spring.adapter.out.entity.UserEntity;
import com.cursojava.Projeto.web.spring.adapter.out.repository.UserRepository;
import com.cursojava.Projeto.web.spring.domain.mapper.UserMapper;
import com.cursojava.Projeto.web.spring.domain.model.UserModel;
import com.cursojava.Projeto.web.spring.domain.port.out.UserServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService implements UserServicePort {
    private final UserMapper userMapper;
    private final UserRepository userRepository;

    @Override
    public List<UserModel> findAll() {
        List<UserEntity> users = userRepository.findAll();
        return userMapper.toModel(users);
    }

    @Override
    public UserModel createdUser(UserEntity userEntity) {
        return userMapper.toModel(userRepository.save(userEntity));
    }

    @Override
    public UserModel findById(String id) {
        Optional<UserEntity> userEntity = userRepository.findById(id);
        return userMapper.toModel(userEntity.get());
    }
}
