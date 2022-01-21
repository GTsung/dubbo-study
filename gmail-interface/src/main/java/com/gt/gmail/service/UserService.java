package com.gt.gmail.service;


import com.gt.gmail.bean.UserAddress;

import java.util.List;

public interface UserService {

    List<UserAddress> getUserAddressList(String userId);
}
