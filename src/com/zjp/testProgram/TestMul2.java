package com.zjp.testProgram;

import java.util.Scanner;
/**
 * 请编写一个完整程序，实现下列功能：从键盘输入数字n，程序自动计算n！，并输出。(注1：n！=1*2*3*...*n，注2：请使用递归实现)
 * 
 * */
public class TestMul2 {
	public static int mul(int num) {
		int sum = 1;
		if (num == 0||num == 1) {
			sum = 1;
		}else if(num > 1){
			sum = num*mul(num-1);
		}
		return sum;
	}
    public static void main(String[] args) {
    	System.out.println("请输入一个整数,并回车：");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n+"的阶乘是："+mul(n));
        
    }
}
