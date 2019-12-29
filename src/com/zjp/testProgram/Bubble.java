package com.zjp.testProgram;
/**
 * ”√java µœ÷√∞≈›≈≈–Ú
 * */
public class Bubble {
	public void sort(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
		    for(int j = 0; j < array.length - i -1; j++) {
		    	if(array[j+1] > array[j]) {
		    		int temp = 0;
		    		temp = array[j+1];
		    		array[j+1] = array[j];
		    		array[j] = temp; 
		    	}
		    	
		    }
		    for(int k=0;k < array.length; k++) {
	    		System.out.print(array[k]);
	    	}
		    System.out.println();
		}
        for(int k=0;k < array.length; k++) {
    		System.out.print(array[k]);
    	}
    	System.out.println();
	}
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		Bubble b = new Bubble();
		b.sort(arr);
		
	}

}
