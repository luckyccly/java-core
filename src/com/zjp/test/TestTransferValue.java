package com.zjp.test;

public class TestTransferValue {
	public void changeValue1(int age) {
		age = 30;
	}
	
	public void changeValue2(Person person) {
		person.setPersonName("xxx");
//		person = new Person("xxx");
	}
	
	public void changeValue3(String str) {
		str = "xxx";
//		str = new String("xxx");
	}
	
	public static void main(String[] args) {
		TestTransferValue test = new TestTransferValue();
		
		int age = 20;
		test.changeValue1(age);
		System.out.println(age);
		
		Person person = new Person("abc");
		test.changeValue2(person);
		System.out.println(person.getPersonName());
		
		String str = "abc";
		test.changeValue3(str);
		System.out.println(str);
	}
	
	static class Person {
		String personName;
		public Person (String personName) {
			this.personName = personName;
		}
		
		public void setPersonName(String personName) {
			this.personName = personName;
		}
		
		public String getPersonName() {
			return this.personName;
		}
	}
}
