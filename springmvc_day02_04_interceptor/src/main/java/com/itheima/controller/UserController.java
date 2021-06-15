package com.itheima.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springmvc_day02_03_exception
 * @description
 * @author: yanbaohui
 * @create: 2021-05-07 21:14
 **/
@Controller("userController")
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testInterceptor")
    public String testInterceptor(){
        System.out.println("testInterceptor执行了。。。");
        return "success";
    }
}
