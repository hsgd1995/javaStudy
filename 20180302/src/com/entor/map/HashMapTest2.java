package com.entor.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ����mapʵ�֣�ͳ������{1,3,8,2,3,7,1}��ÿ��Ԫ�س��ֵĴ�����������ظ����ֵ�Ԫ��<br>
 * �밴�ճ��ִ�����С�����˳���������Ԫ��
 * 
 * @author Administrator
 *
 */
public class HashMapTest2 {
	public static void main(String[] args) {
		// ��������
		int[] arr = { 1, 3, 8, 2, 3, 7, 1 };
		// ��¼�����Լ�������Ӧ��Ԫ��/��¼Ԫ���Լ�Ԫ�ض�Ӧ�Ĵ���
		Map<Integer, Integer> map = new HashMap<>();// K->Ԫ�أ�V->����
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
		// ���ݴ�������Ԫ�ؽ������򣬲����
		// ����V������ʾK
		Object[] objs = new Object[map.size()];
		int index = 0;
		for (Integer integer : keySet) {
			Integer[] ints = new Integer[2];
			ints[0] = integer;
			ints[1] = map.get(integer);
			objs[index] = ints;
			index++;
		}
		// ð������
		for (int i = 0; i < objs.length - 1; i++) {
			for (int j = 0; j < objs.length - i - 1; j++) {
				if (((Integer[]) objs[j])[1] > ((Integer[]) objs[j + 1])[1]) {
					Object temp = objs[j];
					objs[j] = objs[j + 1];
					objs[j + 1] = temp;
				}
			}
		}
		// ���
		System.out.println("����˳���ӡԪ�غʹ�����");
		for (Object object : objs) {
			Integer[] ints = (Integer[]) object;
			System.out.println(ints[0] + ":" + ints[1]);
		}
	}
}
