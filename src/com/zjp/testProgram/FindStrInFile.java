package com.zjp.testProgram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * дһ������������һ���ļ�����һ���ַ�����ͳ������ַ���������ļ��г��ֵĴ���
 * 
 * */
public class FindStrInFile {
    public static void main(String[] args) {
		FindStrInFile f = new FindStrInFile();
		System.out.print(f.count("D:/output.txt", "hello"));
	}
    public int count(String filename,String str) {
    	int sum = 0;
    	BufferedReader br = null;
    	String line = null;
    	try {
			br = new BufferedReader(new FileReader(filename));
			//��ȡһ������
			while((line =br.readLine()) != null) {
				int index = -1;
				while(line.length() >= str.length() && (index = line.indexOf(str)) >= 0) {
					sum++;
					line = line.substring(index + str.length());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
    	return sum;
    }
}
