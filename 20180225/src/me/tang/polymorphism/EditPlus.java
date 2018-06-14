package me.tang.polymorphism;

/**
 * EditPlus编辑器
 * 
 * @author Administrator
 *
 */
public class EditPlus extends Environment {

	public EditPlus(String name) {
		super(name);
	}

	/**
	 * F1点击时间
	 */
	@Override
	public void dealWithClickF1() {
		System.out.println("在" + getName() + "中点击F1，弹出帮助API！");
	}
}
