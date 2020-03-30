package com.zjp.java8.lambdaStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User {
	private int id;
	private int age;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", age=" + age + ", name=" + name + "]";
	}
	/**
	 * 题目：请按照给出数据，找出同时满足以下条件的用户，也即以下条件全部满足：
	 * 偶数ID，且年龄大于24，且用户名转为大写，且用户名字母倒排序只输出一个用户名字
	 * */
	public static void main(String[] args) {
		User u1 = new User(1, 22, "a");
		User u2 = new User(2, 21, "b");
		User u3 = new User(3, 24, "c");
		User u4 = new User(4, 26, "d");
		User u5 = new User(5, 27, "e");
		User u6 = new User(6, 28, "f");
		List<User> list = Arrays.asList(u1,u2,u3,u4,u5,u6);
		//流(Stream)
		list.stream().filter(u -> {
			return u.getId() % 2==0;
			}).filter(u -> {
				return u.getAge() > 24;
			}).map(u -> {
				return u.getName().toUpperCase();
			}).sorted((o1,o2) -> {
				return o2.compareTo(o1);
			}).limit(1).forEach(u -> {
				System.out.println(u);
			});
		
		//普通方法
		//comp(list);
				
	}
	
	public static void comp(List<User> list){
		
		List<User> listRet = new ArrayList<>();
		
		for(int i=0;i<list.size();i++){
			User u = list.get(i);
			if(u.getId()%2==0 && u.getAge() > 24){
				String newName = u.getName().toUpperCase();
				u.setName(newName);
				listRet.add(u);
			}
		}
		Collections.sort(listRet, new Comparator<User>() {

			@Override
			public int compare(User o1, User o2) {
				return o2.getName().charAt(0) - o1.getName().charAt(0);
			}
			
		});
		System.out.println(listRet.get(0).getName());
	}
	
}
