package com.entor.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/**
 * ӳ��<br>
 * ��ϣMap�ǻ���Hash��ĵ�������<br>
 * ��ϣ����key�������������ֵ<br>
 * map��key�������ظ���
 * 
 * @author Administrator
 *
 */
public class HashMapTest {
	public static void main(String[] args) {
		// ������
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "����");
		map.put(2, "����");
		map.put(9, "AK");
		map.put(4, "awp");
		map.put(3, "����");
		map.put(3, "����");// ����3��Ӧ�Ľڵ㣬���ڵ�ľ�ֵ�滻Ϊ�µ�ֵ�����ؾ�ֵ
		System.out.println(map);
		
		// mapͨ��key���value
		System.out.println(map.get(3));
		System.out.println(map.get(123));
		
		// ͨ��map������е�key
		Set<Integer> keySet = map.keySet();
		System.out.println(keySet);
		for(Iterator<Integer> it = keySet.iterator();it.hasNext();){
			System.out.println(it.next());
		}
		// ͨ��map������е�value
		Collection<String> values = map.values();
		for(Iterator<String> it = values.iterator();it.hasNext();){
			System.out.println(it.next());
		}
	}
}
