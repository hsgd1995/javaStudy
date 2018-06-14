package me.tang.polymorphism;

/**
 * Chrome浏览器
 * 
 * @author Administrator
 *
 */
public class Chrome extends Environment {

	public Chrome(String name) {
		super(name);
	}

	/**
	 * F1点击事件
	 */
	@Override
	public void dealWithClickF1() {
		System.out.println("在" + getName() + "中点击F1，弹出新网页https://support.google.com/chrome/?p=help&ctx=keyboard");
	}
}
