package com.zjp.JUC;

import java.util.concurrent.CompletableFuture;

public class CompletableFutureDemo {
	public static void main(String[] args) throws Exception {
		/* CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(()->{
			 System.out.println(Thread.currentThread().getName()+"没有返回，update mysql ok");
		 });
		 completableFuture.get();*/
		 
		 CompletableFuture<Integer> intCompletableFuture = CompletableFuture.supplyAsync(()->{
			System.out.println(Thread.currentThread().getName()+"有返回， insert mysql ok");
			//int ret = 24/0;
			return 1024;
		 });
		 
		 intCompletableFuture.whenComplete((t,u) -> {
			System.out.println("***********t "+t);
			System.out.println("***********u "+u);
		 }).exceptionally(f -> {
			 System.out.println("*****exception"+f.getMessage());
			 return 444;
		 });
	}
}
