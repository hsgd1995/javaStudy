package com.entor.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * 泛型：广泛类型
 * 
 * @author Administrator
 *
 */
public class FanXingTest {

	/**
	 * 将集合中的元素都+1
	 * 
	 * @param list
	 * @return
	 */
	public static void addEach(List list) {
		for (int index = 0; index < list.size(); index++) {
			Object obj = list.get(index);
			if (obj instanceof Integer) {
				list.set(index, (Integer) obj + 1);
			}else if( obj instanceof String){
				Integer val = Integer.valueOf((String)obj) + 1;
				list.set(index, val);
			}
		}
	}

	public static void main(String[] args) {
		// 列表
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("123");
		list.add(new Exception("嘿嘿嘿！"));
		addEach(list);
		System.out.println(list);
		
		// 实际的场合，需要规范集合的使用，给集合添加泛型，保证集合存放的是同一类型的一组数据
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("123");
		List<Integer> list3 = new LinkedList<>(); 
		list3.add(123);	
		Set<Exception> set = new HashSet<>();
		set.add(new Exception("嘿嘿嘿!"));
	}
}
