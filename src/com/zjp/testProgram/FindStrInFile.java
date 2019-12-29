package com.zjp.testProgram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * 写一个方法，输入一个文件名和一个字符串，统计这个字符串在这个文件中出现的次数
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
			//读取一行数据
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
