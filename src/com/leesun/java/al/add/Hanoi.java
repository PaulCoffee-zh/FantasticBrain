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
		hanoi(num,"A","B","C");
	}
	
	public static void hanoi(int n, String A, String B, String C){
		if(n > 0){
			hanoi(n-1,A,C,B);
			System.out.println("Move dish :" + n +" fome pile "+ A + " to " + B);
			hanoi(n-1,C,B,A);
		}
	}

}
