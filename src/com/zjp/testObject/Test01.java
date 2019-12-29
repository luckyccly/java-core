package com.zjp.testObject;

public class Test01 {

	public static void main(String[] args) {
//		Person person = new Person();
//		System.out.println(person.getAge());
//		System.out.println(person.getName());
//		System.out.println(person.getGrade());
		int[] arr = new int[10];
//		System.out.println(arr[0]);
		
		int i = 10;
//		System.out.println(++i%10);
		
		String str1 = new StringBuilder("¼ÆËã»ú").append("Èí¼ş").toString();
		System.out.println(str1.intern() == str1);
		String str2 = new StringBuilder("ja").append("va").toString();
		System.out.println(str2.intern() == str2);
	}

}
