package com.zjp.testProgram;

public class TestSigleton {
	
	private static TestSigleton instance = new TestSigleton();
	private TestSigleton() {}
    public static TestSigleton getInstance() {
    	return instance;
    }
}
/*懒汉模式,线程不安全
 * private static TestSigleton instance;
private TestSigleton() {}
public static TestSigleton getInstance() {
	if(instance == null) {
		instance = new TestSigleton();
	}
	return instance;
}*/
