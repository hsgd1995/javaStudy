package com.entor.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * ����mapʵ�֣�ͳ���ַ���ijeojasldf;kja;sdkjf;asoifasjdf;aksdf;ha;wfihas;ldfkj��ÿ���ַ����ֵĴ���
 * 
 * @author Administrator
 *
 */
public class HashMapTest3 {
	public static void main(String[] args) {
		String string = "ijeojasldf;kja;sdkjf;asoifasjdf;aksdf;ha;wfihas;ldfkj";
		// ��������
		char[] arr = string.toCharArray();
		// ��¼�����Լ�������Ӧ��Ԫ��/��¼Ԫ���Լ�Ԫ�ض�Ӧ�Ĵ���
		Map<Character, Integer> map = new HashMap<>();// K->Ԫ�أ�V->����
		// �������飬��¼Ԫ�صĴ���
		for (char i : arr) {
			if (map.get(i) == null) {// Ԫ�ص�һ�γ���
				map.put(i, 1);// ��һ��
			} else {
				map.put(i, map.get(i) + 1);// ����1��
			}
		}
		// �������ϣ�����ظ�Ԫ��
		Set<Character> keySet = map.keySet();
		for (Character character : keySet) {
			if (map.get(character) >= 2) {
				System.out.println("���֣�" + character + "�ظ����֣�" + map.get(character));
			}
		}
	}
}
