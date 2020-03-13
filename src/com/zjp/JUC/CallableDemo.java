package com.zjp.JUC;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

class MyThread implements Callable<String>{

	@Override
	public String call() throws Exception {
		
		return null;
	}

}
public class CallableDemo {
	//Thread t = new Thread();
	FutureTask futureTask = new FutureTask(new MyThread());
	
	
}
