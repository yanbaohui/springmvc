package com.itheima.controller;

import com.itheima.domain.Account;
import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @program: springmvc_day01_01_start
 * @description
 * @author: yanbaohui
 * @create: 2021-04-28 19:01
 * 请求参数绑定
 **/
@Controller
@RequestMapping("/param")
public class ParamController {

    /**
     * 请求参数绑定封装到JavaBean的类当中
     * @author yanbaohui
     * @date 2021/4/28 19:02
     * @return java.lang.String
     */
    @RequestMapping("/testParam")
    public String testParam(String username){
        System.out.println("执行了");
        System.out.println(username);
        return "success";
    }

    /**
     * 封装复杂类型list map数据
     * @author yanbaohui
     * @date 2021/4/28 22:31
     * @param account
     * @return java.lang.String
     */
    @RequestMapping("/saveAccount")
    public String saveAccount(Account account){
        System.out.println("执行了");
        System.out.println(account);
        return "success";
    }

    /**
     * 自定义类型转换器
     * @author yanbaohui
     * @date 2021/4/28 22:31
     * @param user
     * @return java.lang.String
     */
    @RequestMapping("/saveUser")
    public String saveUser(User user){
        System.out.println("执行了");
        System.out.println(user);
        return "success";
    }

    /**
     * 原生的api获取
     * @author yanbaohui
     * @date 2021/4/29 14:16
     * @return java.lang.String
     */
    @RequestMapping("/testServlet")
    public String testServlet(HttpServletRequest req, HttpServletResponse rep){
        System.out.println("执行了");
        System.out.println(req);
        HttpSession session = req.getSession();
        System.out.println(session);
        ServletContext context = session.getServletContext();
        System.out.println(context);
        System.out.println(rep);
        return "success";
    }
}
