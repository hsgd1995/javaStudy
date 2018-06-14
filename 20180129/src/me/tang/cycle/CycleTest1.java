package me.tang.cycle;

/**
 * for循环
 * @author Administrator
 *
 */
public class CycleTest1 {

	public static void main(String[] args) {
		for(int i = 1;i <= 100;i++){
			System.out.println("循环体i："+i);
		}
		for(int j = 1;j <=100;){
			System.out.println("循环体j："+j);
			 ++j;
		}
		int k = 1;
		for(;k <= 100;k++){
			System.out.println("循环体k:"+k);
		}
	}

}
