package com.leesun.java.al.add;

import java.util.Scanner;

/**
 * 1 
 * 5  2
 * 8  6  3 
 * 10  9  7 4
 * @author LeeSun
 * @comment 
 * @date 2016年12月24日 下午9:16:25
 */
public class ZhengXing {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		printZx(scan.nextInt());
	}
	
	public static void printZx(int n){
		int[][] arr = new int[100][100];
		int k =1;
		for (int i = 0; i <= n; i++) {
			for(int j = 1; j < n+1-i;j++){
				arr[i-1+j][j] = k;
				k++;
			}
		}
		for(int i = 0; i < n ;i++){
			System.out.println();
			for (int j = 1; j < n; j++) {
				if(arr[i][j] == 0)continue;
				System.out.print(arr[i][j]+"("+i+","+j+") ");
			}
		}
	}

}
