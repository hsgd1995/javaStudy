package com.entor.timmerAndTask;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTest {
    public static void main(String[] args) {
        /*// 1.创建任务
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("铃铃铃....");
            }
        };

        // 2.创建定时器
        Timer timer = new Timer();
        // 安排定时器计划任务，并启动定时器任务
        timer.schedule(timerTask, 5000);*/

        //3.创建新的任务
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("铃铃铃....");
                timer.cancel();// 当任务结束后，取消当前定时器计划
            }
        }, 5000);
        Timer t2 = new Timer();
        t2.schedule(new TimerTask() {
            @Override
            public void run() {
                for(int i = 1; i <= 5; i++){
                    System.out.println(i);
                }
                t2.cancel();
            }
        },10000);
    }
}
