package com.itheima.exception;

/**
 * @program: springmvc_day02_03_exception
 * @description
 * @author: yanbaohui
 * @create: 2021-05-07 21:20
 * 自定义异常类
 **/
public class SysException extends Exception {


    //存储提示信息
    private String message;

    public SysException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
