package com.qf.day40.dao;

import com.qf.day40.entity.Account;

import java.sql.SQLException;
import java.util.List;

public interface AccountDAO {
    int save(Account account) throws SQLException;
    int update(Account account) throws SQLException;
    int delete(Integer id) throws SQLException;
    Account findById(Integer id) throws SQLException;
    List<Account> findAll() throws SQLException;
}
