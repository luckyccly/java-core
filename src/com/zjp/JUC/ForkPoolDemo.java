package com.zjp.JUC;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;

/**
 * ��֧�ϲ����
 * */
class MyTask extends RecursiveTask<Integer>{
	public static final Integer ADJUST_VALUE = 10;
	private int begin;
	private int end;
	private int result;
	
	public MyTask(int begin, int end){
		this.begin = begin;
		this.end = end;
	}
	@Override
	protected Integer compute() {
		if(end - begin < ADJUST_VALUE){
			for(int i = begin; i <= end; i++){
				result = result + i;
			}
		} else {
			int middle = (begin + end)/2;
			MyTask myTask01 = new MyTask(begin, middle);
			MyTask myTask02 = new MyTask(middle+1, end);
			myTask01.fork();
			myTask02.fork();
			result = myTask01.join() + myTask02.join();
		}
		return result;
	}
	
}
public class ForkPoolDemo {
	public static void main(String[] args) throws Exception{
		 MyTask task = new MyTask(0, 10);
		 
		 ForkJoinPool threadPool = new ForkJoinPool();
		 ForkJoinTask<Integer> forkJoinTask = threadPool.submit(task);
		 System.out.println(forkJoinTask.get());
		 threadPool.shutdown();
	}
}
