package com.zjp.test;

public class Test02 {
	    public int[] twoSum(int[] nums, int target) {
	    	for(int i = 0;i < nums.length - 1;i++) {
	    		for(int j = i+1;j < nums.length;j++) {
	    			if(nums[i]+nums[j] == target) {
	    				return new int[] {i,j};
	    			}
	    		}
	    	}
	        return null;
	    }
	    public static void main(String[] args) {
			Test02 test02 = new Test02();
			int[] nums = new int[] {2, 7, 11, 15};
			System.out.println(test02.twoSum(nums, 9)); 
		}
}
