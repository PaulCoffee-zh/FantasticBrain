package com.leesun.java.al.add;

import java.util.Arrays;

import com.leesun.java.al.ScannerUtils;

/**
 * @author LeeSun
 * @comment 找出一维数组中全部可能的组合
 * @date 2017年1月7日 下午11:04:36
 */
public class FindRandomOrg {

	public static void main(String[] args) {
		int n = ScannerUtils.input();
//		cal(n);
//		smarter(n, 3);
		int r = ScannerUtils.input();
		arr[0] = r;
		comb(n, r);
		System.out.println(Arrays.toString(arr));
		System.out.println(deep);
	}

	/**
	 * 穷举
	 * 
	 * @param n
	 */
	public static void cal(int n) {
		int deep = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					if (i < j && j < k) {
						deep++;
						System.out.println(i + " " + j + " " + k);
					}
				}
			}
		}
		System.out.println(deep);
	}

	/**
	 * 确定循环范围再查找
	 * 
	 * @param n
	 * @param r
	 */
	public static void smarter(int n, int r) {
		int deep = 0;
		for (int i = 1; i <= n - r + 1; i++) {
			for (int j = i + 1; j <= n - r + 2; j++) {
				for (int k = j + 1; k <= n - r + 3; k++) {
					deep++;
					System.out.println(i + " " + j + " " + k);
				}
			}
		}
		System.out.println(deep);
	}

	/**
	 * 递归实现
	 */
	private static int arr[] = new int[1000];
	private static int deep ;
	public static void comb(int m, int k) {
		for (int i = m; i >= k; i--) {
			arr[k] = i;
			if (k > 1) {
				deep++;
				comb(i - 1, k - 1);
			} else {
				for (int j = arr[0]; j > 0; j--) {
					System.out.print(arr[j] + " ");
				}
				System.out.println();
			}
		}
	}
}
