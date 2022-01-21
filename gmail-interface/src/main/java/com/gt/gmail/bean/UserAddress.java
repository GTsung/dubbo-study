package com.gt.gmail.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;

/**
 * @author GTsung
 * @date 2022/1/21
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@SuperBuilder
public class UserAddress implements Serializable {

    private Integer id;
    private String userAddress;
    private String userId;
    private String phoneNum;
    private String isDefault;
}
