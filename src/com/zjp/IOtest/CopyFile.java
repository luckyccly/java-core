package com.zjp.IOtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
		String filePathC = "C:/radish/test.png";
		String filePathD = "D:/test.png";
		CopyFile c = new CopyFile();
		c.copyFile(filePathC, filePathD);
	}
    public void copyFile(String filePathC,String filePathD) {
    	FileInputStream fileInputStream = null;
    	FileOutputStream fileOutputStream = null;
    	try {
			fileInputStream = new FileInputStream(filePathC);
			int size = fileInputStream.available();
			byte[] array = new byte[size];
			fileInputStream.read(array);
            fileOutputStream = new FileOutputStream(filePathD);
            fileOutputStream.write(array);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(fileInputStream!=null) {
				try {
					fileInputStream.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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
