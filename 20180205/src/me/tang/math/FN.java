package me.tang.math;

public class FN {
	
	public FN() {
		super();
	}

	/**
	 * �ݹ����1+3+5+...�ĵ�n��
	 * 
	 * @param n
	 * @return
	 */
	public int fn(int n) {
		if (n == 1) {
			return 1;
		}

		return fn(n - 1) + 2;
	}

	/**
	 * �ݹ����1+3+5+...+n�ĺ�
	 * 
	 * @param n
	 * @return
	 */
	public int sum(int n) {
		if (n == 1) {
			return 1;
		}
		return sum(n - 1) + fn(n);
	}

	/**
	 * ����1*2*3*...*n�Ļ�
	 * 
	 * @param n
	 * @return
	 */
	public int mul(int n) {
		if (n == 1) {
			return 1;
		}
		return mul(n - 1) * n;
	}

	/**
	 * �ݹ����1+2+3+...+n�ĺ�
	 * 
	 * @param n
	 * @return
	 */
	public int sum2(int n) {
		if (n == 1) {
			return 1;
		}
		return sum2(n - 1) + n;
	}

	public int fib(int n) {
		if (n < 0){
			throw new RuntimeException("��������������0��");
		}
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return 1;
		}
		return fib(n - 1) + fib(n - 2);
	}

	public int f2(int n){
		return n/(n*n+1);
	}
	public static void main(String[] args) {
		FN fn = new FN();
		System.out.println(fn.fn(6));
		System.out.println(fn.sum(50));
		System.out.println(fn.mul(5));
		System.out.println(fn.sum2(100));
		System.out.println(fn.fib(-1));
	}
}
