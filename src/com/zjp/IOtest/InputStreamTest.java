package com.zjp.IOtest;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamTest {
	public static void main(String[] args) {
		InputStreamTest test = new InputStreamTest();
		String result = test.readFile("D:/HelloWorld.java");//���ļ�������ʱ�ᱨ��
		System.out.println(result);
	}
	public String readFile(String filePath) {
		FileInputStream fileInputStream = null;
		String result = null;
		try {
			//����path·��ʵ����һ������������
			fileInputStream = new FileInputStream(filePath);
			int size = fileInputStream.available();
			byte[] array = new byte[size];
			//�����ݶ�ȡ��������
			fileInputStream.read(array);
			//���ݻ�ȡ������õ�һ���ַ����������
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
