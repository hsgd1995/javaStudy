package com.entor.test;

import java.util.LinkedList;

/**
 * 队列
 */
public class MyQueue<E> {
    private static final int MAX_CAPACITY = 10;
    private LinkedList<E> list = new LinkedList<>();

    /**
     * 判断队列是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     * 入队方法
     *
     * @param object
     */
    public void in(E e) {
        // 满队列，先出后入
        if (list.size() == MAX_CAPACITY) {
            list.poll();
        }
        list.add(e);
    }

    /**
     * 出队方法
     *
     * @return
     */
    public E out() {
        return list.poll();
    }
}
