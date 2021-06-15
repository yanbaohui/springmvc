package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

/**
 * @program: springmvc_day02_01_response
 * @description
 * @author: yanbaohui
 * @create: 2021-04-30 11:24
 **/

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/testString")
    public String testString(Model model){
        System.out.println("testString 执行了。。。");
        //模拟数据库查询
        User user = new User();
        user.setUname("美美");
        user.setAge(20);
        user.setDate(new Date());
        //model对象
        model.addAttribute("user",user);

        return "success";
    }

    /**
     * 请求转发一次请求，不用去编写项目的名称
     * @author yanbaohui
     * @date 2021/5/6 18:46
     * @param request
     * @param response
     */
    @RequestMapping("/testVoid")
    public void testVoid(HttpServletRequest request, HttpServletResponse response) throws Exception{
        System.out.println("testVoid 执行了。。。");

        //编写请求转发
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);

        //重定向
        //response.sendRedirect(request.getContextPath()+"/index.jsp");

        //设置中文乱码
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        //直接会进行响应
        response.getWriter().print("你好");
        return;

    }

    /**
     * 返回ModelAndView
     * @author yanbaohui
     * @date 2021/5/6 19:01
     */
    @RequestMapping("/testModelAndView")
    public ModelAndView testModelAndView(){
        //创建ModelAndView对象
        ModelAndView mv = new ModelAndView();
        System.out.println("testModelAndView执行了...");
        //模拟数据库查询
        User user = new User();
        user.setUname("小风");
        user.setAge(20);
        user.setDate(new Date());

        //把user对象存储到mv对象中，也会把user对象存入到request域对象中
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }
    /**
     * 使用关键的方式进行转发或者重定向
     * @author yanbaohui
     * @date 2021/5/6 19:26
     * @return org.springframework.web.servlet.ModelAndView
     */
    @RequestMapping("/testForwardOrRedirect")
    public String testForwardOrRedirect(){
        //请求转发
        //return "forward:/WEB-INF/pages/success.jsp";

        //重定向
        return "redirect:/index.jsp";
    }

    /**
     * 模拟异步请求响应
     * @author yanbaohui
     * @date 2021/5/6 20:18
     */
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax执行了...");
        //客户端发送ajax请求，传的是json字符串，后端把json字符串封装到user对象中
        System.out.println(user);
        //做响应，模拟查询数据库
        user.setUname("haha");
        user.setAge(40);
        //做响应
        return user;
    }


}
