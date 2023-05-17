package com.qf.day40.utils;

public interface SQLConstants {
    String ACCOUNT_SAVE = "INSERT INTO account(email, pwd, truename, qq, wx, phone) VALUES(?,?,?,?,?,?)";
    String ACCOUNT_FIND_ALL = "SELECT a.id, a.email, a.pwd, a.truename, a.qq, a.wx, a.phone FROM account AS a";
    String ACCOUNT_FIND_BY_ID = "SELECT a.id, a.email, a.pwd, a.truename, a.qq, a.wx, a.phone FROM account a WHERE a.id = ?";
    String ACCOUNT_UPDATE = "UPDATE account SET email=?, pwd=?, truename=?, qq=?, wx=?, phone=? WHERE id = ?";
    String ACCOUNT_DELETE = "DELETE FROM account WHERE id = ?";
}
