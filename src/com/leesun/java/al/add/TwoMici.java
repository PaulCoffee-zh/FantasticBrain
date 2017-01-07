package com.leesun.java.al.add;

import com.leesun.java.al.ScannerUtils;

/**
 * @author LeeSun
 * @comment ��һ�������������Ա�ʾ��2���ݴ�
 * @date 2017��1��7�� ����10:53:55
 */
public class TwoMici {

	public static void main(String[] args) {
		int n = ScannerUtils.input();
		cal(n, 0);
		System.out.println("-----------------");
		calR(n, 0);
	}

	/**
	 * n: ������ r: �ݴ����
	 */
	public static void cal(int n, int r) {
		if (n == 1) {
			System.out.print("2(" + r + ")");
		} else {
			cal(n / 2, r + 1);
			if (n % 2 == 1) {
				System.out.print("+2(" + r + ")");
			}
		}
	}

	public static void calR(int n, int r) {
		if (n == 1) {
			switch (r) {
			case 0:
				System.out.print("2(0)");
				break;
			case 1:
				System.out.print("2(1)");
				break;
			case 2:
				System.out.print("2(2)");
				break;
			default:
				System.out.print("2(");
				calR(r, 0);
				System.out.print(")");
				break;
			}
		} else {
			calR(n / 2, r + 1);
			if (n % 2 == 1) {
				switch (r) {
				case 0:
					System.out.print("+2(0)");
					break;
				case 1:
					System.out.print("+2(1)");
					break;
				case 2:
					System.out.print("+2(2)");
					break;
				default:
					System.out.print("+2(");
					calR(r, 0);
					System.out.print(")");
					break;
				}
			}
		}
	}

}
