package com.zjp.JUC;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class MyThreadPoolDemo {
	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());//获取cpu核数
		ExecutorService threadPool = new ThreadPoolExecutor(2, 5, 2L, TimeUnit.SECONDS, 
				new LinkedBlockingDeque<>(3),Executors.defaultThreadFactory(),new ThreadPoolExecutor.DiscardOldestPolicy());
		
		try {
			for(int i = 1; i <= 10; i++){
				//TimeUnit.SECONDS.sleep(1);
				threadPool.execute(()->{
					System.out.println(Thread.currentThread().getName()+"\t 办理业务");
				});
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally{
			threadPool.shutdown();
		}
	}
	public static void initPool(){
				//ExecutorService threadPool = Executors.newFixedThreadPool(5);//一池5个工作线程，类似一个银行有5个受理窗口
				//ExecutorService threadPool = Executors.newSingleThreadExecutor();//一池1个工作线程
				ExecutorService threadPool = Executors.newCachedThreadPool();//一池N个工作线程 
				
				try {
					for(int i = 1; i <= 10; i++){
						TimeUnit.SECONDS.sleep(1);
						threadPool.execute(()->{
							System.out.println(Thread.currentThread().getName()+"\t 办理业务");
						});
					}
				} catch (Exception e) {
					e.printStackTrace();
				} finally{
					threadPool.shutdown();
				}
	}
}
