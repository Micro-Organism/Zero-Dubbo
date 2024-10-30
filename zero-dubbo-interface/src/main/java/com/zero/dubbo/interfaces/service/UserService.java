package com.zero.dubbo.interfaces.service;

import com.zero.dubbo.interfaces.domain.entity.SystemUserEntity;

public interface UserService {

    String getUserInfo();

    SystemUserEntity getUserById(String userId);
}
