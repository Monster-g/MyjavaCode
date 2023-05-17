package com.qf.day40.service.impl;

import com.qf.day40.dao.AccountDAO;
import com.qf.day40.dao.impl.AccountDAOImpl;
import com.qf.day40.entity.Account;
import com.qf.day40.service.AccountService;
import com.qf.day40.utils.DBConnection;

import java.sql.SQLException;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    private AccountDAO accountDAO = new AccountDAOImpl();

    @Override
    public int save(Account account) {
        try {
            return accountDAO.save(account);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                DBConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public int update(Account account) {
        try {
            return accountDAO.update(account);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                DBConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public int delete(Integer id) {
        try {
            return accountDAO.delete(id);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                DBConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    @Override
    public Account findById(Integer id) {
        try {
            return accountDAO.findById(id);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                DBConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<Account> findAll() {
        try {
            return accountDAO.findAll();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                DBConnection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
