package me.tang.test;

import java.util.LinkedList;

/**
 * LinkedList，使用LinkedList实现队列，提供入队（public void in(Object object)）、<br>
 * 出队（public Object out()）和<br>
 * 判断队列是否为空（public boolean isEmpty()）三个方法。
 * 
 * @author Administrator
 *
 */
public class LinkedListTest {
	LinkedList linkedList = new LinkedList<>();

	/**
	 * 入队
	 * 
	 * @param object
	 */
	public void in(Object object) {
		// 向队列末尾添加元素
		linkedList.addLast(object);
		System.out.println(object + "已入队");
	}

	/**
	 * 出队
	 * 
	 * @return
	 */
	public Object out() {
		// 移除并返回第一个元素
		Object object = linkedList.poll();
		System.out.println(object + "已出队");
		return object;

	}

	/**
	 * 判断队列是否为空
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		// 若队列为空则返回true
		return linkedList.isEmpty();

	}

	public static void main(String[] args) {
		// 创建队列
		LinkedListTest l = new LinkedListTest();
		// 入队
		l.in("张三");
		l.in("李四");
		// 出队
		l.out();
		l.out();
		// 判断是否为空
		if (l.isEmpty()) {
			System.out.println("队列为空");
		} else {
			System.out.println("队列不为空");
		}
	}

}
