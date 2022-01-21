package com.gt.gmail.service.impl;

import com.gt.gmail.bean.UserAddress;
import com.gt.gmail.service.OrderService;
import com.gt.gmail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GTsung
 * @date 2022/1/21
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private UserService userService;

    @Override
    public void initOrder(String userId) {
        List<UserAddress> userAddresses = userService.getUserAddressList(userId);
        userAddresses.forEach(System.out::println);
    }
}
