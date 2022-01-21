package com.gt.gmail.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.gt.gmail.bean.UserAddress;
import com.gt.gmail.service.OrderService;
import com.gt.gmail.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author GTsung
 * @date 2022/1/21
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Reference // 消費用reference 生產用service
    private UserService userService;

    @Override
    public void initOrder(String userId) {
        List<UserAddress> userAddresses = userService.getUserAddressList(userId);
        userAddresses.forEach(System.out::println);
    }
}
