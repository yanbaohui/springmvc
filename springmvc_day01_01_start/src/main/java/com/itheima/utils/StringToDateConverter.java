package com.itheima.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @program: springmvc_day01_01_start
 * @description
 * @author: yanbaohui
 * @create: 2021-04-28 22:37
 * 字符串转日期 0000-0-0
 **/
public class StringToDateConverter implements Converter<String, Date> {

    /**
     *
     * @author yanbaohui
     * @date 2021/4/28 22:39
     * @param s 传入进来的字符串
     * @return java.util.Date
     */
    @Override
    public Date convert(String s) {
        if (s == null || "".equals(s)){
            throw new RuntimeException("请您传入数据");
        }
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd");
        try {
            return df.parse(s);
        } catch (Exception e) {
            throw new RuntimeException("数据类型转换出错");
        }
    }
}
