package com.zjp.IOtest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamTest {
    public static void main(String[] args) {
		String filePath = "D:/output.txt";
		String content = "This is a test file for FileOutputStream.";
		OutputStreamTest test = new OutputStreamTest();
		test.writeFile(filePath, content);
	}	
    public void writeFile(String filePath,String content) {
    	FileOutputStream fileOutputStream = null;
    	try {
    		//根据文件路径创建出流对象
			fileOutputStream = new FileOutputStream(filePath);
			//把写入内容String转为数组
			byte[] array = content.getBytes();
			fileOutputStream.write(array);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fileOutputStream!=null) {
				try {
					fileOutputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
    }
}
