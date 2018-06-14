package com.entor.collection;

import java.util.ArrayList;

/**
 * 可变大小的数组
 * 
 * @author Administrator
 *
 */
public class ArrayListTest {
	public static void aaa(Object o) {
		System.out.println(o);
	}
	
	public static void main(String[] args) {
		// 构造器
		ArrayList list = new ArrayList();// 底层：this.elementData = {};
		
		// 常用方法
		list.add(1);// 在集合的第一个位置放置1
		list.add(1.1);
		list.add("123");
		list.add(new Exception("嘿嘿嘿"));
		list.add(new int[] { 1, 2, 3, 4 });
		list.add(null);
		System.out.println(list);
		System.out.println(list.size());
		
		Object obj = list.get(3);// this.elementData[3]
		System.out.println(obj);
		
		list.ensureCapacity(20);// 将集合的容量修改成20，将原有的元素按照顺序放在新数组中，多余的空间用缺省值赋值
		list.ensureCapacity(1);// 因为当前容量大于1，修改失败
		
		list.add(1, 1.2);// 插入
		
		obj = list.remove(3);// 根据索引删除
		System.out.println(obj);
		
		list.remove(new Integer(1));// 根据元素本身删除
		System.out.println(list);

		int index = list.indexOf(1.2);
		System.out.println(index);
		
		boolean isExist = list.contains(1.2);
		System.out.println(isExist);
		
		obj = list.set(1, 999);// 替换
		System.out.println(list.get(1) + "<==>" + obj);
		
		System.out.println(list.isEmpty());
		
		Object[] objs = list.toArray();// 将底层的数组有效元素复制到新的数组
		for (Object object : objs) {
			System.out.println(object);
		}
		
		list.clear();// 将元素都用缺省值替换掉，将size重置为0
		System.out.println(list);
	}
}
