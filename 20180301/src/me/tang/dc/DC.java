package me.tang.dc;

import java.lang.instrument.IllegalClassFormatException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ˫ɫ��Listʵ��˫ɫ��
 */
public class DC {
	// �˿�ѡ���ĺ����б�
	private List<Integer> CustomerBuyList = new ArrayList<Integer>();
	// ���������ɫ������б�
	private List<Integer> blueChromosphere = new ArrayList<Integer>();
	// ���������ɫ������б�
	private List<Integer> redChromosphere = new ArrayList<Integer>();

	/**
	 * �˿�ѡ������
	 */
	public void buyChromosphere() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�����˫ɫ�����(��ɫ��1~33����ɫ��1~16),��ɫ���벻���ظ�");
		// �˿�ÿ������ĺ���
		int number = 0;
		try {
			// ѭ��7�Σ��ù˿�����7������
			for (int i = 1; i <= 7; i++) {
				if (i <= 6) {
					// i<=6��ǰ6������������
					System.out.println("�������" + i + "��������룺");
					// ����˿���������ֵ��ַ�����Scanner�׳��쳣
					number = sc.nextInt();
					// ����˿�����ĺ�����볬����Χ�����׳��쳣
					if (number < 1 || number > 33) {
						throw new IllegalClassFormatException();
					}
				} else {
					// ��7�������������
					System.out.println("������һ��������룺");
					number = sc.nextInt();
					// ����˿������������볬����Χ�����׳��쳣
					if (number < 1 || number > 16) {
						throw new IllegalClassFormatException();
					}
				}
				// ���˿�����ĺ������˿�ѡ���ĺ����б�
				CustomerBuyList.add(i - 1, number);
			}
			// �������ĺ����Ƿ����ظ���������ظ����׳��쳣
			if (!checkRepeat(CustomerBuyList) || CustomerBuyList.size() == 0) {
				throw new IllegalClassFormatException();
			}
		} catch (Exception e) {
			// e.printStackTrace();
			// �쳣����
			// ��ʾ�˿������������
			System.out.println("����ĺ��벻��ȷ��������ĺ�ɫ�������1~33֮�䣬���������1~16֮��");
			// ��֮ǰ����ĺ������
			CustomerBuyList.clear();
			// �ݹ�˷������ù˿���������
			buyChromosphere();
		}
	}

	/**
	 * <p>
	 * ����������Ƿ����ظ���ֻ����������Ƿ��ظ�
	 * </p>
	 * ���ظ�����false�����򷵻�true
	 * 
	 * @param list
	 * @return boolean
	 */
	public boolean checkRepeat(List list) {
		// ѭ��list��ʹlist��ÿ��Ԫ��������Ԫ�ض��ȽϹ�
		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < i; j++) {
				// ���±�Ϊi��Ԫ����list������������Ԫ�ض��Ƚ�һ��
				if (list.get(i) == list.get(j)) {
					return false;
				}
			}
		}
		return true;
	}

	/**
	 * ���ÿ������루�����
	 */
	public void setResultNumber() {
		int redResult = 0;
		int blueResult = 0;
		// ����6���������
		for (int i = 0; i < 6; i++) {
			redResult = (int) (Math.random() * 33);
			redChromosphere.add(i, redResult);
		}
		blueResult = (int) (Math.random() * 16);
		// �����������������б�
		blueChromosphere.add(0, blueResult);
		// ����������ظ����������ɿ�������
		if (!checkRepeat(redChromosphere)) {
			setResultNumber();
		} else {
			return;
		}
	}

	/**
	 * ���ÿ������루�ֶ���ӣ�
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
	 * ���ÿ������룺ģ��ҡ�����̣�redLimit�����������blueLimit���������
	 * @param redLimit
	 * @param blueLimit
	 */
	public void setResultNumber(int redLimit,int blueLimit){
		//��������
		List redBalls = new ArrayList();
		//��������
		List blueBalls = new ArrayList();
		//������������Ӻ���
		for(int i =0;i<redLimit;i++){
			redBalls.add(i+1);
		}
		//������������Ӻ���
		for(int i =0;i<blueLimit;i++){
			blueBalls.add(i+1);
		}
		//System.out.println(redBalls);
		//System.out.println(blueBalls);
		//ҡ�����̣�ҡ��6������
		for(int j=0;j<6;j++){
			//�����������
			int redIndex = (int)(Math.random()*redBalls.size());
			//�����������е��������ָ��ĺ���ȡ���������뿪������
			redChromosphere.add(j, (int)redBalls.get(redIndex));
			redBalls.remove(redIndex);
		}
		//�����������
		int blueIndex = (int)(Math.random()*blueBalls.size());
		//�����������е��������ָ��ĺ���ȡ���������뿪������
		blueChromosphere.add(0, (int)redBalls.get(blueIndex));
		//������������ɾ����ȡ������
		blueBalls.remove(blueIndex);
		System.out.println(redChromosphere);
		System.out.println(blueChromosphere);
	}
	
	
	
	/**
	 * У���Ƿ��н�
	 */
	public void isWin() {
		// ����н��ĺ�ɫ����
		List redResult = new ArrayList();
		// ����н�����ɫ����
		int blueResult = 0;
		// У���ɫ�����Ƿ��н�
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				if (CustomerBuyList.get(i) == redChromosphere.get(j)) {
					redResult.add(CustomerBuyList.get(i));
				}
			}
		}
		// У����ɫ�����Ƿ��н�
		if (CustomerBuyList.get(6) == blueChromosphere.get(0)) {
			// ����н������blueResult
			blueResult = CustomerBuyList.get(6);
		}
		// ��ӡ��������
		System.out.print("�������Ϊ������\t");
		for (int k = 0; k < redChromosphere.size(); k++) {
			System.out.print(redChromosphere.get(k) + "\t");
		}
		System.out.print("����" + blueChromosphere.get(0));
		System.out.println();

		// �������н�����ĸ����ж�Ϊ���Ƚ�
		// ����������н�������Ϊ����
		switch (redResult.size()) {
		case 0:
			if (blueResult != 0) {
				System.out.println("��ϲ�������Ƚ���");
			} else {
				System.out.println("���ź�����û�н���");
			}
			break;
		case 1:
			if (blueResult != 0) {
				System.out.println("��ϲ�������Ƚ���");
			} else {
				System.out.println("���ź�����û�н���");
			}
			break;
		case 2:
			if (blueResult != 0) {
				System.out.println("��ϲ�������Ƚ���");
			} else {
				System.out.println("���ź�����û�н���");
			}
			break;
		case 3:
			if (blueResult != 0) {
				System.out.println("��ϲ������Ƚ���");
			} else {
				System.out.println("���ź�����û�н���");
			}
			break;
		case 4:
			if (blueResult != 0) {
				System.out.println("��ϲ�����ĵȽ���");
			} else {
				System.out.println("��ϲ������Ƚ���");
			}
			break;
		case 5:
			if (blueResult != 0) {
				System.out.println("��ϲ�������Ƚ���");
			} else {
				System.out.println("��ϲ�����ĵȽ���");
			}
			break;
		case 6:
			if (blueResult != 0) {
				System.out.println("��ϲ����һ�Ƚ���");
			} else {
				System.out.println("��ϲ���ö��Ƚ���");
			}
			break;
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DC dc = new DC();
		// �˿�ѡ������
		dc.buyChromosphere();
		List<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(15);
		list.add(16);
		list.add(21);
		list.add(26);
		list.add(29);
		// ���ÿ�������
		// dc.setResultNumber(list, 16);
		//dc.setResultNumber();
		dc.setResultNumber(33, 16);
		// У���н�����
		dc.isWin();
	}

}
