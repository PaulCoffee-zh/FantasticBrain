package com.leesun.java.al;

import java.math.BigDecimal;

/**
 * 
 * @author LeeSun
 * @comment �ݹ��㷨
 * @date 2016��12��22�� ����9:56:37
 */
public class Recursion {

	public static void main(String[] args) {
		BigDecimal big = new BigDecimal(5);
		System.out.println(recursion(big).toString());
	}

	/**
	 * long�����ֵ��Χ��
	 * @param n
	 * @return
	 */
	public static long recursion(long n){
		if(n == 0){
			return 1;
		}
		long i = n-1;
		return n*recursion(i);
	}
	
	/**
	 * ���޴�
	 * @param n
	 * @return
	 */
	public static BigDecimal recursion(BigDecimal n){
		if(n.equals(BigDecimal.ZERO)){
			return BigDecimal.ONE;
		}
		BigDecimal i = n.add(new BigDecimal(-1));
		BigDecimal result = n.multiply(recursion(i));
		return result;
	}
}
