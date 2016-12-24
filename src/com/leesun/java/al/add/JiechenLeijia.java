package com.leesun.java.al.add;

import java.util.Scanner;

/**
 * 1-3!+5!-7!...+(-1)`(n+1)(2n-1)!
 * 
 * @author LeeSun
 * @comment
 * @date 2016年12月24日 下午3:14:41
 */
public class JiechenLeijia {

	public static void main(String[] args) {
		int re = 1;
		for (int i = 1; i <= 3; i++) {
			re *=i;
		}
		System.out.println(re);
		System.out.print("请输入参数：");
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(forAdd(n));
		System.out.println(easyAdd(n));

	}

	public static int forAdd(int n) {
		int result = 1;
		int sign = 1;
		for (int i = 2; i <= n; i++) {
			int mutiplyAll = 1;
			for(int j = 1;j <= 2*i-1;j++){
				mutiplyAll *= j;
			}
			sign *= -1;
			result += sign * mutiplyAll;
			System.out.println(result);
		}
		return result;
	}
	public static int easyAdd(int n){
		int result = 1;
		int sign = 1;
		int mu = 1;
		for(int i = 2 ; i <= n ; i++){
			sign = -sign;
			mu *= (2*i-2)*(2*i-1);
			result += sign*mu;
		}
		return result;
	}

}
