package com.zero.dubbo.provider.service;

import com.zero.dubbo.interfaces.domain.entity.SystemUserEntity;
import com.zero.dubbo.interfaces.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

/**
 * @service import package is org.apache.dubbo.config.annotation.Service
 */
@Service
@Component
@Slf4j
public class UserServiceImpl implements UserService {

    @Override
    public String getUserInfo() {
        log.info("this is a test");
        return "userTest";
    }

    @Override
    public SystemUserEntity getUserById(String userId) {
        log.info("invoke getUserById method");
        SystemUserEntity user = new SystemUserEntity();
        user.setUserId(Long.valueOf(userId));
        user.setUserInfo("test");
        user.setUserName("lin");
        return user;
    }

}
