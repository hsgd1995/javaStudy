package me.tang.bms.view;

import java.util.Scanner;

import me.tang.bms.entity.User;
import me.tang.bms.service.UserService;
import me.tang.bms.service.impl.UserServiceImpl;

public class UserView {
	private Scanner sc = new Scanner(System.in);
	private UserService userService = new UserServiceImpl();

	public UserView() {
		// ��ӭҳ��
		welcome();
	}

	/**
	 * ��ӭҳ
	 */
	private void welcome() {
		System.out.println("+++++��ӭʹ��ͼ�����ϵͳ+++++");
		System.out.println("+++++1.�û�ע��                  +++++");
		System.out.println("+++++2.��¼ϵͳ                  +++++");
		System.out.println("+++++3.�˳�ϵͳ                  +++++");

		while (true) {
			System.out.println("������ѡ�");
			String option = sc.next();
			if ("1".equals(option)) {// ��תע��ҳ
				register();
				return;
			}

			if ("2".equals(option)) {// ��ת��¼ҳ

				return;
			}

			if ("3".equals(option)) {// �˳�ϵͳ
				System.exit(0);
			}

			System.out.println("��������ȷ��ѡ�");
		}
	}

	/**
	 * ע��
	 */
	private void register() {
		System.out.println("+++++ע��ҳ��+++++");
		System.out.println("������������");
		String name = sc.next();
		System.out.println("������֤���ţ�");
		String idCard = sc.next();

		// ���ݷ�װ������
		User user = new User();
		user.setUid(1);
		user.setName(name);
		user.setIdCard(idCard);
		user.setStatus(0);

		user.getRentBooks().add(1);
		user.getRentBooks().add(2);
		user.getRentBooks().add(3);
		user.getRentBooks().add(4);

		// �������ݶ���
		userService.saveUser(user);
		System.out.println("ע��ɹ���");
	}

}
