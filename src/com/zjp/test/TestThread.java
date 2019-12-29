package com.zjp.test;

public class TestThread extends Thread{
	private String name;
	
	public TestThread(String name) {
		this.name = name;
	}
	
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println(name + "Test Thread:" + i);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		TestThread testThread1 = new TestThread("Thread1");
		TestThread testThread2 = new TestThread("Thread2");
		testThread1.start();
		testThread2.start();
	}
	
}
