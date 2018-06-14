package me.tang.oop;

import java.util.Scanner;

public class Customer {
	private String[] customer = new String[100];//存放客户姓名的数组
	int cusCount =0;//客户总数：用于记住已存放了多少个客户姓名
	/**
	 * 添加客户姓名
	 * @return
	 */
	public void addCustomer(){
		//设置boolean类型的变量，用作while循环的条件
		boolean flag = true;
		System.out.print("请输入客户的姓名：");
		
		saveCustomer();
		while(flag){
			
			System.out.print("继续输入吗？（y/n）：");
			
			Scanner scanner = new Scanner(System.in);
			String  customerName = scanner.next().trim();//去掉string变量的前后空格，防止输入客户姓名时前后有空格
			
			if("y".trim().equals(customerName.trim()) ){
				//输入的信息为y可继续输入姓名
				System.out.print("请输入客户的姓名：");
				//继续执行将客户信息保存到数组的方法
				saveCustomer();

			}else if("n".trim().equals(customerName.trim()) ){
				//输入的信息为n，将flag设为false，意义为在本轮while循环执行完后跳出while循环
				flag = false;
				//打印已保存到数组中的客户姓名
				getCustomerList();
			}else{
				//当输入的信息不为y或n时提示输入正确字符
				System.out.println("请输入正确的字符：y或者n");
				
			}
		}
		
	}
	
	/**
	 * 将客户姓名保存到数组中
	 */
	public void saveCustomer(){
		
		//用于获取控制台输入的信息
		Scanner scanner = new Scanner(System.in);
		String  customerName = scanner.next().trim();
		
		//客户姓名存放到数组中
		customer[cusCount] = customerName;
		//当存放一个客户姓名后 客户总数+1
		cusCount++;
		
	}
	
	/**
	 * 打印数组中的客户姓名
	 */
	public void getCustomerList(){
		System.out.println("********************************");
		System.out.println("***********客户姓名列表**********");
		//按已存放的客户姓名的个数执行打印语句
		for(int i=0;i<cusCount; i++){
			System.out.print(i+":"+customer[i]+"   ");
		}
		System.out.println("");	//打印一行空格，将上下的信息隔开
		System.out.println("********************************");

	}
	
	
	/**
	 * 查找客户姓名
	 * @param name
	 * @return 找到就返回true
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
		System.out.print("请输入要查找的客户姓名：");
		Scanner scanner = new Scanner(System.in);
		String  customerName = scanner.next().trim();
		
		boolean flag = search(customerName.trim());
		if(flag){
			System.out.println("找到了!");
		}else{
			System.out.println("没有该客户！");
		}
	}
	
	
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.customerClient();
		
	}
}
