package com.zhiliao.controller;


import com.zhiliao.comment.Result;
import com.zhiliao.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: hsn
 * @description:
 * @date: 2019/10/12 14:14
 **/
@RestController
@RequestMapping(value = "/test")
public class TestController {


    @GetMapping(value = "getString")
    public String getString(){
        return "胡淑娜";
    }



    @Autowired
    private User user;

    @RequestMapping(value = "/getUser")
    public Result getUser(){
        return Result.createSuccess("200",user.getUser());
    }
}
