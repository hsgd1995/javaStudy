package me.tang.person;

/**
 * ����Ա������
 * 
 * @author Administrator
 *
 */
public class SalespersonTest {

	public static void main(String[] args) {
		Salesperson s = new Salesperson();
		s.setAge(40);
		s.setName("����");
		s.setSno("20000");
		System.out.println(s);
		s.sale();
		s.work();
	}

}
