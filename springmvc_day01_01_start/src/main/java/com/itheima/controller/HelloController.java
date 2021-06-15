package com.itheima.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @program: springmvc_day01_01_start
 * @description
 * @author: yanbaohui
 * @create: 2021-04-27 21:30
 * 控制器类  接受请求
 **/

@Controller
public class HelloController {

    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello SpringMVC");
        return "success";
    }
}
