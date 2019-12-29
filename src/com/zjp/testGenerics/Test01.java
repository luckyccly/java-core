package com.zjp.testGenerics;

public class Test01 {
	public static<E> void printArray(E[] inputArray) {
		for(E element:inputArray) {
			System.out.printf("%s", element);
		}
		System.out.println();
	}
    public static void main(String[] args) {
    	Integer[] intArray = {1, 2, 3, 4, 5};
    	printArray(intArray);
        System.out.println();
    	
    }
}
