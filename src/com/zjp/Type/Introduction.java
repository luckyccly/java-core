package com.zjp.Type;

public class Introduction implements PersonInfo {
    private String sex;
    private String name;
    private int age;
	public Introduction(String sex, String name, int age) {
		super();
		this.sex = sex;
		this.name = name;
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		String str = " [sex=" + sex + ", name=" + name + ", age=" + age + "]";
		return "���ҽ��ܣ� "+"\n" +
        "\t|-����: " + this.name + "\n" +
        "\t|-�Ա�: " + this.sex + "\n" +
        "\t|-����: " + this.age;
	};
    
}
