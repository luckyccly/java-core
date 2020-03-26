package com.zjp.JUC;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<String>{

	@Override
	public String call() throws Exception {
		System.out.println("call method.....");
		return "aaa";
	}

}
//
public class CallableDemo {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		//Thread t = new Thread();
		FutureTask futureTask = new FutureTask(new MyThread());
		//以下两个线程使用同一个futureTask对象，所以call()方法只会调用一次。
		new Thread(futureTask,"A").start();
		new Thread(futureTask,"B").start();
		String ret = (String)futureTask.get();
		System.out.println(ret);
	}
	
}
