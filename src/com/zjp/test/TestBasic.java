package com.zjp.test;

public class TestBasic {

	public static void main(String[] args) {
		short s1 = 1,s2 = 2;
		short s3 = (short) (s1 + s2);
		System.out.println(getType(s1));
	}

	public static String getType(Object o) { // ��ȡ�������ͷ���
		return o.getClass().toString(); // ʹ��int���͵�getClass()����
	}

}
