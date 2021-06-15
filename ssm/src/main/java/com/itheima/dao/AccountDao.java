package com.itheima.dao;

import com.itheima.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @program: ssm
 * @description
 * @author: yanbaohui
 * @create: 2021-05-08 15:11
 **/
@Repository
public interface AccountDao {

    @Select("select * from account")
    public List<Account> findAll();

    @Insert("insert into account(name,money)values(#{name},#{money})")
    public void saveAccount(Account account);
}
