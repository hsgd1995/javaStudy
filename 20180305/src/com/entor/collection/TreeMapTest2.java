package com.entor.collection;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * ����mapʵ�֣�ͳ������{1,3,8,2,3,7,1}��ÿ��Ԫ�س��ֵĴ�����������ظ����ֵ�Ԫ��<br>
 * 
 * @author Administrator
 *
 */
public class TreeMapTest2 {
	public static void main(String[] args) {
		// ��������
		int[] arr = { 1, 3, 8, 2, 3, 7, 1 };
		// ��¼�����Լ�������Ӧ��Ԫ��/��¼Ԫ���Լ�Ԫ�ض�Ӧ�Ĵ���
		Map<Integer, Integer> map = new TreeMap<>();// K->Ԫ�أ�V->����
		// �������飬��¼Ԫ�صĴ���
		for (int i : arr) {
			if (map.get(i) == null) {// Ԫ�ص�һ�γ���
				map.put(i, 1);// ��һ��
			} else {
				map.put(i, map.get(i) + 1);// ����1��
			}
		}
		// �������ϣ�����ظ�Ԫ��
		Set<Integer> keySet = map.keySet();
		for (Integer integer : keySet) {
			if (map.get(integer) >= 2) {
				System.out.println("���֣�" + integer + "�ظ����֣�" + map.get(integer));
			}
		}
		System.out.println(map);
	}
}
