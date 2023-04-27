package com.qf.day30.utils;

public interface SQLConstants {
    String SQL_ACCOUNT_INSERT = "INSERT INTO account VALUES(?,?)";
    String SQL_ACCOUNT_FIND_ALL = "SELECT * FROM account";
    String SQL_ACCOUNT_UPDATE = "UPDATE account set money = ? where account = ?";
}
