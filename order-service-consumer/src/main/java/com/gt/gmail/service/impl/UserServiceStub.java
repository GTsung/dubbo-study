package com.gt.gmail.service.impl;

import com.gt.gmail.bean.UserAddress;
import com.gt.gmail.service.UserService;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * 存根
 * @author GTsung
 * @date 2022/1/21
 */
public class UserServiceStub implements UserService {

    private final UserService userService;

    public UserServiceStub(UserService userService) {
        this.userService = userService;
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        if(!StringUtils.isEmpty(userId)) {
            return userService.getUserAddressList(userId);
        }
        return null;
    }
}
