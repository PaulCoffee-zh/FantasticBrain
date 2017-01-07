package com.leesun.java.al.add;

import com.leesun.java.al.ScannerUtils;

/**
 * 
 * @author LeeSun
 * @comment 汉诺塔问题 hanoi(n,a,b,c)
 * @date 2016年12月24日 下午10:07:37
 */
public class Hanoi {

	public static void main(String[] args) {
		int num = ScannerUtils.input();
		hanoi(num, "A", "B", "C");
		System.out.println("=======我是分割等号==========");
		hanoiFor(num, "A", "B", "C");
	}

	public static void hanoi(int n, String A, String B, String C) {
		if (n > 0) {
			hanoi(n - 1, A, C, B);
			System.out.println("Move dish :" + n + " fome pile " + A + " to " + B);
			hanoi(n - 1, C, B, A);
		}
	}

	// A -- > B
	public static void hanoiFor(int n, String A, String B, String C) {
		String temp = "";
		while (n > 0) {
			// hanoiFor(n-1,A,C,B);
			// A -- > C
			while (n > 0) {
				--n;
				temp = B;
				B = C;
				C = temp;
				System.out.println("Move dish :" + n + " fome pile " + A + " to " + C);
			}
			// C -- > B
			System.out.println("Move dish :" + n + " fome pile " + C + " to " + B);
			--n;
			temp = A;
			A = C;
			C = temp;
		}
	}

}
