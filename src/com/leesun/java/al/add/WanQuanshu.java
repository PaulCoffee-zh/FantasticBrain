package com.leesun.java.al.add;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 完全数
 * 
 * @author LeeSun
 * @comment 因子相加等于本数
 * @date 2016年12月24日 下午4:38:40
 */
public class WanQuanshu {


	public static void main(String[] args) {
		System.out.println("please input num:");
		Scanner scan = new Scanner(System.in);
		cal(scan.nextInt());
	}

	public static void cal(int n) {
		int[] yz = new int[100000];
		for (int i = 2; i <= n; i++) {
			int sum = 1;
			int k = 1;
			yz[0]=1;
			for (int j = 2; j < i; j++) {
				if(i%j == 0 ){
					sum += j;
					yz[k]  = j;
					k++;
				}
			}
//			System.out.println(sum);
			if(i == sum){
				System.out.println(i+":"+Arrays.toString(yz));
			}
		}
	}
}
