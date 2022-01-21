package com.gt.gmail.controller;

import com.gt.gmail.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GTsung
 * @date 2022/1/21
 */
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/initOrder")
    public void initOrder(String userId) {
        orderService.initOrder(userId);
    }
}
