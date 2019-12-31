package com.zjp.java8.methodRefrence;

import java.util.ArrayList;
import java.util.List;

public class EmployeeData {
	public static List<Employee> getEmployees(){
		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1001, "张三", 34, 1000));
		list.add(new Employee(1002, "李四", 35, 2000));
		list.add(new Employee(1003, "王五", 36, 3000));
		list.add(new Employee(1004, "赵六", 37, 4000));
		list.add(new Employee(1005, "田七", 38, 5000));
		list.add(new Employee(1006, "全八", 39, 6000));
		list.add(new Employee(1007, "梁九", 40, 7000));
		list.add(new Employee(1008, "欧阳十", 41, 8000));
		return list;
	}

}
