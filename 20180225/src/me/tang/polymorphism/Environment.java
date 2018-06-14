package me.tang.polymorphism;

/**
 * 编辑器环境
 * 
 * @author Administrator
 *
 */
public class Environment {
	private String name;

	public Environment() {
		super();
	}

	public Environment(String name) {
		super();
		this.name = name;
	}

	/**
	 * F1点击事件
	 */
	public void dealWithClickF1() {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
