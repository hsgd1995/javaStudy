package me.tang.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * �쳣����
 * 
 * @author Administrator
 *
 */
public class ExceptionTest4 {
	// ����һ�����֣�����100����1000���Ը�����������
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���������֣�");
		try {
			int input = sc.nextInt();// java.util.InputMismatchException���벻ƥ���쳣
			if (input < 100) {
				/*
				 * try { throw new Exception("���������븺��!"); } catch (Exception e)
				 * { System.err.println("�쳣��Ϣ��" + e.getMessage()); }
				 */
				throw new Exception("���������븺��!");
			}
			System.out.println("�������" + 1000 / (input + 100));
		} catch (InputMismatchException ime) {
			System.err.println("�쳣��Ϣ��" + ime.getMessage());
		} catch (ArithmeticException ae) {
			System.err.println("�쳣��Ϣ��" + ae.getMessage());
		} catch (Exception e) {
			// e = new Exception("���������븺��!")
			// e = new InputMismatchException("��ƥ��");
			System.err.println("�쳣��Ϣ��" + e.getMessage());
		} finally {// �����Ƿ����쳣����ִ�е����
			System.out.println("try-catch�����...");
		}
		System.out.println("�������н���...");
	}
}
