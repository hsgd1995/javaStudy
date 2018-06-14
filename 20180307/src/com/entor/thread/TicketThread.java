package com.entor.thread;

public class TicketThread extends Thread {
    private int ticket;// 余票
    private int number;// 购买张数

    public TicketThread() {
    }

    public TicketThread(String name, int ticket, int number) {
        super(name);
        this.ticket = ticket;
        this.number = number;
    }

    @Override
    public void run() {
        if (ticket - number >= 0) {
            System.out.println(Thread.currentThread().getName() + "购买成功，剩余：" + (ticket -= number));
        } else {
            System.out.println("余票：" + ticket + "张, 不足" + number + "，" + Thread.currentThread().getName() + "购买失败！");
        }
    }
}
