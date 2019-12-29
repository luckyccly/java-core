package com.zjp.testProgram;

import java.util.Scanner;

/**
 * 用java实现利用递归方法求5!
 * */
public class TestMul {
	public int mul(int n) {
		int sum = 0;
		if(n ==1 || n == 0) {
			sum = 1;
		}else if(n > 1) {
			sum = n*mul(n-1);
		}
		return sum;
	}
	public static void main(String[] args) {
		TestMul testMul = new TestMul();
		System.out.println(testMul.mul(5));
		
	}
}
