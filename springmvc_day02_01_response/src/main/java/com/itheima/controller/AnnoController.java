package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.support.SessionStatus;

import java.util.Date;
import java.util.Map;

/**
 * @program: springmvc_day01_01_start
 * @description
 * @author: yanbaohui
 * @create: 2021-04-29 14:31
 * 常用的注解
 **/
@Controller
@RequestMapping("/anno")
@SessionAttributes(value = {"msg"}) //把msg=美美存入到session域对象中一份
public class AnnoController {

    /**
     *@RequestParam 注解演示
     * @param username
     * @return
     */
    @RequestMapping("/testRequestParam")
    public String testRequestParam(@RequestParam(name = "name") String username){
        System.out.println("执行了...");
        System.out.println(username);
        return "success";
    }

    /**
     * 获取请求体的内容
     * @author yanbaohui
     * @date 2021/4/29 14:45
     * @param body
     * @return java.lang.String
     */
    @RequestMapping("/testRequestBody")
    public String testRequestBody(@RequestBody String body){
        System.out.println("执行了...");
        System.out.println(body);
        return "success";
    }

    /**
     * @PathVariable 注解使用
     * @author yanbaohui
     * @date 2021/4/29 15:01
     * @return java.lang.String
     */
    @RequestMapping(value = "/testPathVariable/{sid}", method = RequestMethod.POST)
    public String testPathVariable(@PathVariable(name = "sid") String id){
        System.out.println("执行了...");
        System.out.println(id);
        return "success";
    }

//    @RequestMapping(value = "/testModelAttribute")
//    public String testModelAttribute(User user){
//        System.out.println("执行了...");
//        System.out.println(user);
//        return "success";
//    }
//
//    @ModelAttribute
//    public User showModel(String username){
//        //模拟去数据库查询
//        User abc = findUserByName(username);
//        System.out.println("执行了 showModel 方法"+abc);
//        return abc;
//    }


    /**
     * 模拟修改用户方法
     * @param user
     * @return
     */
    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(@ModelAttribute("abc")User user) {
        System.out.println("控制器中处理请求的方法：修改用户："+user);
        return "success";
    }

    /**
     * 查询数据库中用户信息
     * @param
     */
//    @ModelAttribute
//    public void showModel(String username, Map<String,User> map) {
//        //模拟去数据库查询
//        User user = findUserByName(username);
//        System.out.println("执行了 showModel 方法"+user);
//        map.put("abc",user);
//    }


    /**
     * 模拟数据库查询
     * @author yanbaohui
     * @date 2021/4/29 19:32
     * @param username
     * @return com.itheima.domain.User
     */
    public User findUserByName(String username) {
        User user = new User();
        user.setUname(username);
        user.setAge(19);
        user.setDate(new Date());
        return user;
    }


    /**
     * @SessionAttribute注解
     * @author yanbaohui
     * @date 2021/4/30 10:15
     * @return java.lang.String
     */
    @RequestMapping("/testSessionAttribute")
    public String testSessionAttribute(Model model){
        System.out.println("SessionAttribute执行了。。。");

        //底层会存到request域对象中
        model.addAttribute("msg","美美");
        return "success";
    }

    @RequestMapping("/getSessionAttribute")
    public String getSessionAttribute(ModelMap modelMap){
        //从session域中取值
        String msg = (String) modelMap.get("msg");

        System.out.println(msg);
        return "success";
    }

    @RequestMapping("/deSessionAttribute")
    public String deSessionAttribute(SessionStatus status){
        //清除
        status.setComplete();
        return "success";
    }




}
