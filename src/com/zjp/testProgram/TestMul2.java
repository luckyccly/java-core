package com.zjp.testProgram;

import java.util.Scanner;
/**
 * ���дһ����������ʵ�����й��ܣ��Ӽ�����������n�������Զ�����n�����������(ע1��n��=1*2*3*...*n��ע2����ʹ�õݹ�ʵ��)
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
    	System.out.println("������һ������,���س���");
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(n+"�Ľ׳��ǣ�"+mul(n));
        
    }
}
