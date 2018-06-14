package me.tang.person;

/**
 * 父类：员工类
 * @author Administrator
 *
 */
public class Employee {
	private String name;//姓名
	private int age;//年龄
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * 工作
	 */
	public void work(){
		System.out.println(name+"在工作");
	}
	
}
