package me.tang.oop;

public class Calculator {

	/**
	 * ����һ��������ʵ�������������
	 * 
	 * @param num1
	 * @param num2
	 * @param num3
	 * @return double
	 */
	public void mulThreeNumber(double num1, double num2, double num3) {
		System.out.println(num1 + "*" + num2 + "*" + num3 + "=" + num1 * num2 * num3);
	}

	/**
	 * ����һ��������ʵ�������������
	 * 
	 * @param num1
	 * @param num2
	 * @return double
	 */
	public double divTowNumber(double num1, double num2) {
		return num1 / num2;
	}

	/**
	 * ����һ��������ʵ������������������
	 * 
	 * @param num1
	 * @param num2
	 * @param flag
	 * @return double
	 */
	public double calculator(double num1, double num2, String flag)  {
		double result = 0;
		switch (flag) {
		case "+":
			result = num1 + num2;
			break;
		case "-":
			result = num1 - num2;
			break;
		case "*":
			result = num1 * num2;
			break;
		case "/":
			result = num1 / num2;
			break;
		case "%":
			result = num1 % num2;
			break;
		default:
			throw new RuntimeException("��������ȷ�Ĳ�����");
		}
		return result;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		cal.mulThreeNumber(2, 3, 4);
		double result2 = cal.divTowNumber(6, 2);
		System.out.println("result2:" + result2);
		double result3 = cal.calculator(3, 0, "7");
		System.out.println("result3:" + result3);
	}

}
