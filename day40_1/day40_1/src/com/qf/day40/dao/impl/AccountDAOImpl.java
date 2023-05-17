package com.qf.day40.dao.impl;

import com.qf.day40.dao.AccountDAO;
import com.qf.day40.entity.Account;
import com.qf.day40.utils.DBConnection;
import com.qf.day40.utils.SQLConstants;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {
    private QueryRunner runner = new QueryRunner();

    @Override
    public int save(Account account) throws SQLException {
        return runner.update(DBConnection.getConnection(), SQLConstants.ACCOUNT_SAVE,
                account.getEmail(), account.getPwd(), account.getTruename(),
                account.getQq(), account.getWx(), account.getPhone());
    }

    @Override
    public int update(Account account) throws SQLException {
        return runner.update(DBConnection.getConnection(), SQLConstants.ACCOUNT_UPDATE,
                account.getEmail(), account.getPwd(), account.getTruename(),
                account.getQq(), account.getWx(), account.getPhone(), account.getId());
    }

    @Override
    public int delete(Integer id) throws SQLException {
        return runner.update(DBConnection.getConnection(), SQLConstants.ACCOUNT_DELETE, id);
    }

    @Override
    public Account findById(Integer id) throws SQLException {
        return runner.query(DBConnection.getConnection(), SQLConstants.ACCOUNT_FIND_BY_ID,
                new BeanHandler<>(Account.class), id);
    }

    @Override
    public List<Account> findAll() throws SQLException {
        return runner.query(DBConnection.getConnection(), SQLConstants.ACCOUNT_FIND_ALL,
                new BeanListHandler<>(Account.class));
    }
}
