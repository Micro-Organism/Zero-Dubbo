package com.zero.dubbo.interfaces.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SystemUserEntity implements Serializable {
    private static final long serialVersionUID = -4294369157631461921L;

    Long userId;
    String userName;
    String userInfo;

}

