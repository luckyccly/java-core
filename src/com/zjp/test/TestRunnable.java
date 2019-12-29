package com.zjp.test;

public class TestRunnable implements Runnable {
	private String name;

	public TestRunnable(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for(int i=0;i<10000;i++) {
			System.out.println(name + " thread:" +i);
		}
	}

	public static void main(String[] args) {
		TestRunnable thread1 = new TestRunnable("Thread A");
		TestRunnable thread2 = new TestRunnable("Thread B");
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		
		t1.start();
		t2.start();
		
	}
}
