package com.zjp.IOtest;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamTest {
	public static void main(String[] args) {
		InputStreamTest test = new InputStreamTest();
		String result = test.readFile("D:/HelloWorld.java");//当文件不存在时会报错
		System.out.println(result);
	}
	public String readFile(String filePath) {
		FileInputStream fileInputStream = null;
		String result = null;
		try {
			//根据path路径实例化一个输入流对象
			fileInputStream = new FileInputStream(filePath);
			int size = fileInputStream.available();
			byte[] array = new byte[size];
			//把数据读取到数组中
			fileInputStream.read(array);
			//根据获取的数组得到一个字符串，并输出
			result = new String(array);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fileInputStream != null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}
