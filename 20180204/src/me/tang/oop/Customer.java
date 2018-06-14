package me.tang.oop;

import java.util.Scanner;

public class Customer {
	private String[] customer = new String[100];//��ſͻ�����������
	int cusCount =0;//�ͻ����������ڼ�ס�Ѵ���˶��ٸ��ͻ�����
	/**
	 * ��ӿͻ�����
	 * @return
	 */
	public void addCustomer(){
		//����boolean���͵ı���������whileѭ��������
		boolean flag = true;
		System.out.print("������ͻ���������");
		
		saveCustomer();
		while(flag){
			
			System.out.print("���������𣿣�y/n����");
			
			Scanner scanner = new Scanner(System.in);
			String  customerName = scanner.next().trim();//ȥ��string������ǰ��ո񣬷�ֹ����ͻ�����ʱǰ���пո�
			
			if("y".trim().equals(customerName.trim()) ){
				//�������ϢΪy�ɼ�����������
				System.out.print("������ͻ���������");
				//����ִ�н��ͻ���Ϣ���浽����ķ���
				saveCustomer();

			}else if("n".trim().equals(customerName.trim()) ){
				//�������ϢΪn����flag��Ϊfalse������Ϊ�ڱ���whileѭ��ִ���������whileѭ��
				flag = false;
				//��ӡ�ѱ��浽�����еĿͻ�����
				getCustomerList();
			}else{
				//���������Ϣ��Ϊy��nʱ��ʾ������ȷ�ַ�
				System.out.println("��������ȷ���ַ���y����n");
				
			}
		}
		
	}
	
	/**
	 * ���ͻ��������浽������
	 */
	public void saveCustomer(){
		
		//���ڻ�ȡ����̨�������Ϣ
		Scanner scanner = new Scanner(System.in);
		String  customerName = scanner.next().trim();
		
		//�ͻ�������ŵ�������
		customer[cusCount] = customerName;
		//�����һ���ͻ������� �ͻ�����+1
		cusCount++;
		
	}
	
	/**
	 * ��ӡ�����еĿͻ�����
	 */
	public void getCustomerList(){
		System.out.println("********************************");
		System.out.println("***********�ͻ������б�**********");
		//���Ѵ�ŵĿͻ������ĸ���ִ�д�ӡ���
		for(int i=0;i<cusCount; i++){
			System.out.print(i+":"+customer[i]+"   ");
		}
		System.out.println("");	//��ӡһ�пո񣬽����µ���Ϣ����
		System.out.println("********************************");

	}
	
	
	/**
	 * ���ҿͻ�����
	 * @param name
	 * @return �ҵ��ͷ���true
	 */
	public boolean  search(String name){
		boolean flag = false;
		for(int i=0;i<cusCount; i++){
			if(name.trim().equals(customer[i])){
				flag = true;
			}
		}
		return flag;
	}

	
	public void customerClient(){
		addCustomer();
		System.out.print("������Ҫ���ҵĿͻ�������");
		Scanner scanner = new Scanner(System.in);
		String  customerName = scanner.next().trim();
		
		boolean flag = search(customerName.trim());
		if(flag){
			System.out.println("�ҵ���!");
		}else{
			System.out.println("û�иÿͻ���");
		}
	}
	
	
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.customerClient();
		
	}
}
