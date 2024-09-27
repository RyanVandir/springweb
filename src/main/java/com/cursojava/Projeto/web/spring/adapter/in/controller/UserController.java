package com.cursojava.Projeto.web.spring.adapter.in.controller;

import com.cursojava.Projeto.web.spring.adapter.in.request.UserRequest;
import com.cursojava.Projeto.web.spring.domain.mapper.UserMapper;
import com.cursojava.Projeto.web.spring.domain.port.in.UserCorePort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
@RequiredArgsConstructor
public class UserController {
    private final UserCorePort userCorePort;
    private final UserMapper userMapper;

    @PostMapping
    public ResponseEntity<UserRequest> createdUser(@RequestBody UserRequest userRequest) {
        UserRequest response = userCorePort.createdUser(userMapper.toModel(userRequest));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public List<UserRequest> findAll() {
        return userCorePort.findAll();
    }

    @GetMapping("/{id}")
    public UserRequest findById(@PathVariable String id) {
        return userCorePort.findById(id);
    }
}