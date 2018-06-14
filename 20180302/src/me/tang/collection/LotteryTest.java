package me.tang.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 双色球投注区分为红色球号码区和蓝色球号码区，红色球号码区由1-33共三十三个号码组成，<br>
 * 蓝色球号码区由1-16共十六个号码组成。投注时选择6个红色球号码和1个蓝色球号码组成一注进行单式投注
 * 
 * @author Administrator
 *
 */
public class LotteryTest {
	public static void main(String[] args) {
		// 在33个红球中选出6个，在16个蓝球中选出1个，组合成中奖号码
		// 选球应该是随机
		// 号码球怎么表示？选球过程怎么设计？中奖号码怎么表示？
		// 数组保存号码球以及中奖号码
		// 选择集合来代替数组，表示每一组号码球

		// 1.创建红球集合
		List redballs = new ArrayList();
		for (int i = 1; i <= 33; i++) {
			redballs.add(i);
		}
		System.out.println("红球：" + redballs);
		// 2.创建蓝球集合
		List blueballs = new ArrayList();
		for (int i = 1; i <= 16; i++) {
			blueballs.add(i);
		}
		System.out.println("蓝球：" + blueballs);
		// 3.中奖号码集合
		List pools = new ArrayList();
		// 4.选球
		Random random = new Random();
		for (int i = 1; i <= 6; i++) {
			int index = random.nextInt(redballs.size());
			pools.add(redballs.get(index));// 取出对应的红球，放到奖池中
			redballs.remove(index);// 取出的红球不在原来的集合中
		}
		int index = random.nextInt(blueballs.size());
		pools.add(blueballs.get(index));// 取出对应的蓝球，放到奖池中
		blueballs.remove(index);// 取出的蓝球不在原来的集合中
		// 5.输出中奖号码
		System.out.println("本期中奖号码\t\t\t特别号码");
		System.out.println(pools + "\t" + pools.get(pools.size() - 1));
	}
}
