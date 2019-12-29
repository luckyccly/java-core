package com.zjp.testObject;

public class ObRef extends Base{
    public static void main(String[] args) {
    	ObRef ob = new ObRef();
    	Base b = new Base();
    	Object o1 = new Object();
    	IFace o2 = new CFace();
    	
    	o1 = o2;
    	b = ob;
    	ob = (ObRef) b;
    	o1 = b;
    	
    	System.out.println(b);
    }
}
