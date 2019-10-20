package com.zhiliao.service;

import com.zhiliao.vo.UserVO;
import org.springframework.stereotype.Service;

@Service
public class User {

    public UserVO getUser(){

        UserVO userVO = new UserVO();
        userVO.setId(1);
        userVO.setName("hushuna");
        userVO.setAge((byte) 3);
        userVO.setPhone("19945096907");
        return userVO;
    }
}
