package com.entor.test;

public class MyQueueTest {
    public static void main(String[] args) {
        // 创建空队�?
        MyQueue<String> myQueue = new MyQueue<>();
        // 入队
        myQueue.in("123");
        myQueue.in("234");
        myQueue.in("324");
        myQueue.in("aaa");
        myQueue.in("xxx");
        myQueue.in("ccc");
        myQueue.in("ddd");
        myQueue.in("fff");
        myQueue.in("qqq");
        myQueue.in("666");
        myQueue.in("nb");
        myQueue.in("123123");
        // 出队
        System.out.println(myQueue.out());
    }
}
