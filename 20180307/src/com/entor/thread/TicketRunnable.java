package com.entor.thread;

public class TicketRunnable implements Runnable {
    private int ticket;
    private int number;

    public TicketRunnable() {
    }

    public TicketRunnable(int ticket, int number) {
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
