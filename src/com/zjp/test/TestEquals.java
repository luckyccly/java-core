package com.zjp.test;

public class TestEquals {
     public static void main(String[] args) {
		String s1 = "通话";
		String s2 = "重地";
		System.out.println(String. format("str1：%d | str2：%d",  s1. hashCode(),s2. hashCode()));
		System.out.println(s1.equals(s2));
			
	}
}
