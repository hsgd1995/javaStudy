package com.entor.thread.synchronize;

public class GetMoneyThread extends Thread {
    private Account account;
    private String name;
    private double number;

    public GetMoneyThread(Account account, String name, double number) {
        super(name);
        this.account = account;
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getPriority());
        double num = account.post(number);
        if (num != 0)
            System.out.println(Thread.currentThread().getName() + "取款" + number + "成功！");
        else
            System.out.println("余额不足，" + Thread.currentThread().getName() + "取款失败！");
        System.out.println("账户余额：" + account.getMoney());
    }

    /*synchronized (account) {// 给指定对象加锁
        if (account.getMoney() - number >= 0) {
            account.setMoney(account.getMoney() - number);
            System.out.println(Thread.currentThread().getName() + "取款" + number + "成功！");
        } else {
            System.out.println("余额不足，" + Thread.currentThread().getName() + "取款失败！");
        }
        System.out.println("账户余额：" + account.getMoney());
    }*/

    // 锁静态变量，本质上是对静态变量所处的类的Class对象进行加锁
}
