package com.gt.gmail.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.gt.gmail.bean.UserAddress;
import com.gt.gmail.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * @author GTsung
 * @date 2022/1/21
 */
@Service // dubbo的service
@Component
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress userAddress1 = UserAddress.builder().id(1).isDefault("N")
                .phoneNum("13300991111").userAddress("中南海").userId("1").build();
        UserAddress userAddress2 = UserAddress.builder()
                .id(2).userAddress("納海").phoneNum("13300991111").userId("1")
                .isDefault("Y").build();
        return Arrays.asList(userAddress1, userAddress2);
    }
}
