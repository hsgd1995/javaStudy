package me.tang.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * 遍历集合
 * 
 * @author Administrator
 *
 */
public class Study1 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		// 便利list并打印元素
		list.forEach(System.out::println);
		// 取值分别操作
		list.forEach(i -> {
			System.out.println(i * 3);
		});
	}

}
