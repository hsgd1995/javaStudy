package me.tang.polymorphism;

/**
 * Eclipse编辑器
 * 
 * @author Administrator
 *
 */
public class Eclipse extends Environment {

	public Eclipse(String name) {
		super(name);
	}

	/**
	 * F1点击时间
	 */
	@Override
	public void dealWithClickF1() {
		System.out.println("在" + getName() + "中点击F1，弹出help窗口！");
	}
}
