package com.leesun.java.al;

import java.util.Scanner;

/**
 * 
 * @author LeeSun
 * @comment �����ݽ׳�(׼ȷ�Դ���֤)
 * @date 2016��12��22�� ����11:08:07
 */
public class BigDataAl {
	private static int[] resultArray = new int[10000000]; 

	static int resultJinwei = 0;
	static long index = 0;
	
	public static void main(String[] args) {
		System.out.println("������Ҫ��׳˵�N��ֵ��");
		Scanner sin = new Scanner(System.in);
		int number = sin.nextInt();
		long maxIndex = method(number);
		System.out.println("�׳�Ϊ:");
		for (long i = maxIndex-1; i >= 0; i--) {
			System.out.print(resultArray[(int) i]);
			if(i % 100 == 0) { //�˴��������ʽ������ʱ��Ϊeclipse�������Ŀ���̨ÿ������ĳ������޶������Դ����ÿ�����100����
				System.out.println();
			}
		}
	}

	public static long method(long number) {
		long maxIndex = 1;
		int temp = 0;
		//int tempMaxIndex = 0;
		resultArray[0] = 1;
		for (long i = 1; i <= number; i++) {
			for (long j = 0; j < maxIndex; j++) {
				resultArray[(int) j] *= i;
				resultArray[(int) j] += resultJinwei;
				temp = resultArray[(int) j];
				if (temp >= 10) {
					resultArray[(int) index] = temp % 10;
					resultJinwei = temp / 10;
					index++;
					if(maxIndex<index+1)
						maxIndex = index+1;
					
				} else {
					index++;
					resultJinwei = 0;
				}				
			}
			index = 0;
			
		}
		return maxIndex;
	}
}
