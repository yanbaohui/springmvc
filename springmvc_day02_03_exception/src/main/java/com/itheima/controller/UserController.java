package com.itheima.controller;

import com.itheima.exception.SysException;
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

    @RequestMapping("/testException")
    public String testException() throws Exception {


        try {
            //模拟异常
            int i = 1/0;
        } catch (Exception e) {
            e.printStackTrace();
            //抛出自定义异常信息
            throw new SysException("查询所有用户出现问题...");
        }

        return "success";
    }
}
