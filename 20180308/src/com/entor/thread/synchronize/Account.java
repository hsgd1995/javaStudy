package com.entor.thread.synchronize;

/**
 * 账户
 */
public class Account {
    private String accountName;// 账户名
    private double money;// 账户余额

    public Account(String accountName, double money) {
        this.accountName = accountName;
        this.money = money;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    // 锁方法对应当前对象
    public synchronized double post(double money) {
        if (this.money - money >= 0) {
            this.money -= money;
            return money;
        }
        return 0;
    }
}
