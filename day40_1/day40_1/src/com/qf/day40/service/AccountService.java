package com.qf.day40.service;

import com.qf.day40.entity.Account;

import java.util.List;

public interface AccountService {
    int save(Account account);
    int update(Account account) ;
    int delete(Integer id) ;
    Account findById(Integer id) ;
    List<Account> findAll() ;
}
