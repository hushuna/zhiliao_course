package com.zhiliao.controller;


import com.zhiliao.comment.Result;
import com.zhiliao.service.User;
import com.zhiliao.vo.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {


    @Autowired
    private User user;

    public Result getUser(){
        return Result.createSuccess("200",user.getUser());
    }
}
