package com.zjp.testCollection;

import java.util.ArrayList;
import java.util.List;

public class TestListDemo4 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		for (String item : list) {
			System.out.println(item);
			if ("1".equals(item)) {
				 list.remove(item);
			}
		}
	}

}
