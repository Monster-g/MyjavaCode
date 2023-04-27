package com.qf.day30.test;

public class Account {
    private String account;
    private int money;

    public Account() {
    }

    public Account(String account, int money) {
        this.account = account;
        this.money = money;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
