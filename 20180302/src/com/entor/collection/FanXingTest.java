package com.entor.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * ���ͣ��㷺����
 * 
 * @author Administrator
 *
 */
public class FanXingTest {

	/**
	 * �������е�Ԫ�ض�+1
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
		// �б�
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("123");
		list.add(new Exception("�ٺٺ٣�"));
		addEach(list);
		System.out.println(list);
		
		// ʵ�ʵĳ��ϣ���Ҫ�淶���ϵ�ʹ�ã���������ӷ��ͣ���֤���ϴ�ŵ���ͬһ���͵�һ������
		ArrayList<String> list2 = new ArrayList<>();
		list2.add("123");
		List<Integer> list3 = new LinkedList<>(); 
		list3.add(123);	
		Set<Exception> set = new HashSet<>();
		set.add(new Exception("�ٺٺ�!"));
	}
}
