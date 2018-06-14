package me.tang.person;

/**
 * 销售员测试类
 * 
 * @author Administrator
 *
 */
public class SalespersonTest {

	public static void main(String[] args) {
		Salesperson s = new Salesperson();
		s.setAge(40);
		s.setName("李四");
		s.setSno("20000");
		System.out.println(s);
		s.sale();
		s.work();
	}

}
