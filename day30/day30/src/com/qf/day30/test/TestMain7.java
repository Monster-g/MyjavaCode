package com.qf.day30.test;

import com.qf.day30.dao.AccountDAO;
import com.qf.day30.dao.impl.AccountDAOImpl;

public class TestMain7 {
    public static void main(String[] args) {
        AccountDAO accountDAO = new AccountDAOImpl();
//        System.out.println(accountDAO.insert(new Account("1006", 10000)));
        System.out.println(accountDAO.findAll());
    }
}
