package com.zjp.testDate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
	public static void fun() {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日");
		String newDate;
		String newDateToday;
		try {
			newDate = sdf.format(new SimpleDateFormat("yyyyMMdd").parse("20121115"));
			newDateToday = sdf.format(new Date());
			System.out.println(newDate);
			System.out.println(newDateToday);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					

	}
	
	public static int multiply(int num) {
		if (num < 0) {
			System.out.println("请输入大于0的数！");
			return -1;
		} else if (num == 0 || num == 1) {
			return 1;
		} else {
			return multiply(num - 1) * num;
		}
	}

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		fun();
		Date date1;
		Date date2;
		long diff = 0;
		try {
			date1 = sdf.parse(sdf.format(new Date()));
			//System.out.println(multiply(100));
			new Thread().sleep(1000);
			date2 = sdf.parse(sdf.format(new Date()));
			diff = date2.getTime() - date1.getTime();
			System.out.println("date2="+date2+";date1="+date1);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(diff / 1000 % 60);
		

	}

}
