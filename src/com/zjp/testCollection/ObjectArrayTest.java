package com.zjp.testCollection;

public class ObjectArrayTest {
	public static void main(String[] args) {
		Student[] student = new Student[5];
		
		Student s1 = new Student("����", 11);
		Student s2 = new Student("����", 12);
		Student s3 = new Student("����", 13);
		Student s4 = new Student("����", 14);
		Student s5 = new Student("����", 15);
		
		student[0] = s1;
		student[1] = s2;
		student[2] = s3;
		student[3] = s4;
		student[4] = s5;
		
		for(int i=0;i<student.length;i++) {
			Student s = student[i];
			System.out.println(s.getName()+"========="+s.getAge());
		}
		
	}

}
