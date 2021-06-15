package com.itheima.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @program: springmvc_day02_04_interceptor
 * @description
 * @author: yanbaohui
 * @create: 2021-05-08 13:52
 * 自定义拦截器
 **/
public class MyInterceptor1 implements HandlerInterceptor {

    /**
     * 预处理,controller执行之前
     * return true 放行，执行下一个拦截器，如果没有，执行controller方法
     * return false 不放行
     * @author yanbaohui
     * @date 2021/5/8 13:53
     * @param request
     * @param response
     * @param handler
     * @return boolean
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("MyInterceptor执行了。。。前");
        return true;
    }

    /**
     * 后处理方法，在controller方法执行之后，success.jsp执行之前
     * @author yanbaohui
     * @date 2021/5/8 14:05
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("MyInterceptor执行了。。。后");
    }

    /**
     * success.jsp页面执行后，该方法会执行
     * @author yanbaohui
     * @date 2021/5/8 14:09
     * @param request
     * @param response
     * @param handler
     * @param ex
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("MyInterceptor执行了。。。最后");
    }
}
