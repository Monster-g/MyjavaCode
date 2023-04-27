package com.qf.day30.dao.impl;

import com.qf.day30.dao.AccountDAO;
import com.qf.day30.entity.Account;
import com.qf.day30.utils.DBConnection;
import com.qf.day30.utils.SQLConstants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AccountDAOImpl implements AccountDAO {
    @Override
    public int insert(Account account) {
        try (
                final Connection connection = DBConnection.getConnection();
                final PreparedStatement preparedStatement = connection.prepareStatement(SQLConstants.SQL_ACCOUNT_INSERT)
        ){
            preparedStatement.setString(1, account.getAccount());
            preparedStatement.setInt(2, account.getMoney());
            return preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int update(Account account) {
        try (
                final Connection connection = DBConnection.getConnection();
                final PreparedStatement preparedStatement = connection.prepareStatement(SQLConstants.SQL_ACCOUNT_UPDATE)
        ){
            preparedStatement.setInt(1, account.getMoney());
            preparedStatement.setString(2, account.getAccount());
            return preparedStatement.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }
        return 0;
    }

    @Override
    public int delete(String account) {
        return 0;
    }

    @Override
    public Account findById(String account) {
        return null;
    }

    @Override
    public List<Account> findAll() {
        List<Account> list = new ArrayList<>();
        try (
                final Connection connection = DBConnection.getConnection();
                final PreparedStatement preparedStatement = connection.prepareStatement(SQLConstants.SQL_ACCOUNT_FIND_ALL)
        ){
            final ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                list.add(new Account(resultSet.getString("account"), resultSet.getInt("money")));
            }
            return list;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
