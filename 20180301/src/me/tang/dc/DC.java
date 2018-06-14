package me.tang.dc;

import java.lang.instrument.IllegalClassFormatException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 双色球：List实现双色球
 */
public class DC {
	// 顾客选定的号码列表
	private List<Integer> CustomerBuyList = new ArrayList<Integer>();
	// 开奖结果蓝色球号码列表
	private List<Integer> blueChromosphere = new ArrayList<Integer>();
	// 开奖结果红色球号码列表
	private List<Integer> redChromosphere = new ArrayList<Integer>();

	/**
	 * 顾客选定号码
	 */
	public void buyChromosphere() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要购买的双色球号码(红色：1~33，蓝色：1~16),红色号码不可重复");
		// 顾客每次输入的号码
		int number = 0;
		try {
			// 循环7次，让顾客输入7个号码
			for (int i = 1; i <= 7; i++) {
				if (i <= 6) {
					// i<=6，前6次输入红球号码
					System.out.println("请输入第" + i + "个红球号码：");
					// 如果顾客输入非数字的字符，则Scanner抛出异常
					number = sc.nextInt();
					// 如果顾客输入的红球号码超出范围，则抛出异常
					if (number < 1 || number > 33) {
						throw new IllegalClassFormatException();
					}
				} else {
					// 第7次输入蓝球号码
					System.out.println("请输入一个蓝球号码：");
					number = sc.nextInt();
					// 如果顾客输入的蓝球号码超出范围，则抛出异常
					if (number < 1 || number > 16) {
						throw new IllegalClassFormatException();
					}
				}
				// 将顾客输入的号码存入顾客选定的号码列表
				CustomerBuyList.add(i - 1, number);
			}
			// 检查输入的号码是否有重复，如果又重复则抛出异常
			if (!checkRepeat(CustomerBuyList) || CustomerBuyList.size() == 0) {
				throw new IllegalClassFormatException();
			}
		} catch (Exception e) {
			// e.printStackTrace();
			// 异常处理
			// 提示顾客重新输入号码
			System.out.println("输入的号码不正确，请输入的红色球号码在1~33之间，蓝球号码在1~16之间");
			// 将之前输入的号码清空
			CustomerBuyList.clear();
			// 递归此方法，让顾客重新输入
			buyChromosphere();
		}
	}

	/**
	 * <p>
	 * 检查红球号码是否有重复，只检查红球号码是否重复
	 * </p>
	 * 有重复返回false，否则返回true
	 * 
	 * @param list
	 * @return boolean
	 */
	public boolean checkRepeat(List list) {
		// 循环list，使list中每个元素与其它元素都比较过
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < i; j++) {
				// 将下标为i的元素与list中排在其后面的元素都比较一次
				if (list.get(i) == list.get(j)) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * 设置开奖号码（随机）
	 */
	public void setResultNumber() {
		int redResult = 0;
		int blueResult = 0;
		// 产生6个随机号码
		for (int i = 0; i < 6; i++) {
			redResult = (int) (Math.random() * 33);
			redChromosphere.add(i, redResult);
		}
		blueResult = (int) (Math.random() * 16);
		// 将号码存入蓝球号码列表
		blueChromosphere.add(0, blueResult);
		// 如果红球有重复则重新生成开奖号码
		if (!checkRepeat(redChromosphere)) {
			setResultNumber();
		} else {
			return;
		}
	}

	/**
	 * 设置开奖号码（手动添加）
	 * 
	 * @param redNumber
	 * @param blueNumber
	 */
	public void setResultNumber(List<Integer> redNumber, int blueNumber) {
		for (int i = 0; i < redNumber.size(); i++) {
			redChromosphere.add(i, redNumber.get(i));
		}
		blueChromosphere.add(0, blueNumber);
	}
	/**
	 * 设置开奖号码：模仿摇奖过程，redLimit：红球个数，blueLimit：蓝球个数
	 * @param redLimit
	 * @param blueLimit
	 */
	public void setResultNumber(int redLimit,int blueLimit){
		//红球箱子
		List redBalls = new ArrayList();
		//蓝球箱子
		List blueBalls = new ArrayList();
		//往红球箱子添加红球
		for(int i =0;i<redLimit;i++){
			redBalls.add(i+1);
		}
		//往蓝球箱子添加红蓝
		for(int i =0;i<blueLimit;i++){
			blueBalls.add(i+1);
		}
		//System.out.println(redBalls);
		//System.out.println(blueBalls);
		//摇奖过程，摇出6个红球
		for(int j=0;j<6;j++){
			//生成随机号码
			int redIndex = (int)(Math.random()*redBalls.size());
			//将红球箱子中的随机号码指向的号码取出，并放入开奖号码
			redChromosphere.add(j, (int)redBalls.get(redIndex));
			redBalls.remove(redIndex);
		}
		//生成随机号码
		int blueIndex = (int)(Math.random()*blueBalls.size());
		//将蓝球箱子中的随机号码指向的号码取出，并放入开奖号码
		blueChromosphere.add(0, (int)redBalls.get(blueIndex));
		//在蓝球箱子中删除已取出的球
		blueBalls.remove(blueIndex);
		System.out.println(redChromosphere);
		System.out.println(blueChromosphere);
	}
	
	
	
	/**
	 * 校验是否中奖
	 */
	public void isWin() {
		// 存放中奖的红色号码
		List redResult = new ArrayList();
		// 存放中奖的蓝色号码
		int blueResult = 0;
		// 校验红色号码是否中奖
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (CustomerBuyList.get(i) == redChromosphere.get(j)) {
					redResult.add(CustomerBuyList.get(i));
				}
			}
		}
		// 校验蓝色号码是否中奖
		if (CustomerBuyList.get(6) == blueChromosphere.get(0)) {
			// 如果中奖则存入blueResult
			blueResult = CustomerBuyList.get(6);
		}
		// 打印开奖号码
		System.out.print("开奖结果为：红球：\t");
		for (int k = 0; k < redChromosphere.size(); k++) {
			System.out.print(redChromosphere.get(k) + "\t");
		}
		System.out.print("蓝球：" + blueChromosphere.get(0));
		System.out.println();

		// 根据已中奖号码的个数判断为几等将
		// 将红球号码中奖个数作为开关
		switch (redResult.size()) {
		case 0:
			if (blueResult != 0) {
				System.out.println("恭喜你获得六等奖！");
			} else {
				System.out.println("很遗憾，你没中奖！");
			}
			break;
		case 1:
			if (blueResult != 0) {
				System.out.println("恭喜你获得六等奖！");
			} else {
				System.out.println("很遗憾，你没中奖！");
			}
			break;
		case 2:
			if (blueResult != 0) {
				System.out.println("恭喜你获得六等奖！");
			} else {
				System.out.println("很遗憾，你没中奖！");
			}
			break;
		case 3:
			if (blueResult != 0) {
				System.out.println("恭喜你获得五等奖！");
			} else {
				System.out.println("很遗憾，你没中奖！");
			}
			break;
		case 4:
			if (blueResult != 0) {
				System.out.println("恭喜你获得四等奖！");
			} else {
				System.out.println("恭喜你获得五等奖！");
			}
			break;
		case 5:
			if (blueResult != 0) {
				System.out.println("恭喜你获得三等奖！");
			} else {
				System.out.println("恭喜你获得四等奖！");
			}
			break;
		case 6:
			if (blueResult != 0) {
				System.out.println("恭喜你获得一等奖！");
			} else {
				System.out.println("恭喜你获得二等奖！");
			}
			break;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DC dc = new DC();
		// 顾客选定号码
		dc.buyChromosphere();
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(15);
		list.add(16);
		list.add(21);
		list.add(26);
		list.add(29);
		// 设置开奖号码
		// dc.setResultNumber(list, 16);
		//dc.setResultNumber();
		dc.setResultNumber(33, 16);
		// 校验中奖级别
		dc.isWin();
	}

}
