package com.entor.thread.synchronize;

public class GetMoneyTest {
    public static void main(String[] args) {
        // 1.创建账户
        Account account = new Account("女朋友", 1000);
        // 2.创建取款线程
        GetMoneyThread t1 = new GetMoneyThread(account, "女朋友", 800);
        t1.setPriority(1);
        GetMoneyThread t2 = new GetMoneyThread(account, "男朋友", 800);
        t2.setPriority(10);
        // 3.启动取款线程
        t1.start();
        t2.start();
    }
}
