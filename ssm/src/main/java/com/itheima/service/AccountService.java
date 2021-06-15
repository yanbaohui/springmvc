package com.itheima.service;

import com.itheima.domain.Account;

import java.util.List;

/**
 * @program: ssm
 * @description
 * @author: yanbaohui
 * @create: 2021-05-08 15:13
 **/
public interface AccountService {

    public List<Account> findAll();
    public void saveAccount(Account account);
}
