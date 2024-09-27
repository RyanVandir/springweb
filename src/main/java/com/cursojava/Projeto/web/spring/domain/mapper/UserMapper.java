package com.cursojava.Projeto.web.spring.domain.mapper;

import com.cursojava.Projeto.web.spring.adapter.in.request.UserRequest;
import com.cursojava.Projeto.web.spring.adapter.out.entity.UserEntity;
import com.cursojava.Projeto.web.spring.domain.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

import java.util.List;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    UserRequest toRequest(UserModel userModel);

    UserModel toModel(UserRequest userRequest);

    UserEntity toEntity(UserModel userModel);

    UserModel toModel(UserEntity userEntity);

    List<UserRequest> toRequest(List<UserModel> userModels);

    List<UserModel> toModel(List<UserEntity> userEntities);
}
