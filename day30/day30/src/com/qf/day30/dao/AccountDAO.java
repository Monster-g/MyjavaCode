package com.qf.day30.dao;

import com.qf.day30.entity.Account;

import java.util.List;

public interface AccountDAO {
    /**
     * 添加
     * @param account
     * @return
     */
    int insert(Account account);

    /**
     * 修改
     * @param account
     * @return
     */
    int update(Account account);

    /**
     * 删除
     * @param account
     * @return
     */
    int delete(String account);

    /**
     * 根据id查询
     * @param account
     * @return
     */
    Account findById(String account);

    /**
     * 查询所有
     * @return
     */
    List<Account> findAll();
}
