package com.zjp.test;


public class TestString {

	public static void main(String[] args) {

		/*String s1 = "string";
		String s2 = "string";
		String s3 = "string";
		String s4 = "str";
		String s5 = "ing";
		String s6 = s4 + s5;
		String ss1 = new String("string");
		String ss2 = new String("string");
		String ss3 = new String("string");

		System.out.println(s1 == s2);
		System.out.println(s2 == s3);
		System.out.println("s3 == s6:" + (s3 == s6));
		System.out.println(s3 == ss1);
		System.out.println(ss1 == ss2);
		System.out.println(ss2 == ss3);*/

		/*String s = A + B; // ������������+���Ӷ�s���г�ʼ��
		String t = "abcd";
		if (s == t) {
			System.out.println("s����t��������ͬһ������");
		} else {
			System.out.println("s������t�����ǲ���ͬһ������");
		}*/
		final String A = "ab"; // ����A
		final String B = "cd"; // ����B
		
		String c = "ab";
		String d = "cd";
		String string= "abcd";
		String AB = A+B;
		String cd = c + d;
		System.out.println("string == AB: " +(string == AB));//true
		System.out.println("string == cd: " +(string == cd));//false
		

	}
}
