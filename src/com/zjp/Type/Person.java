package com.zjp.Type;

public class Person<T extends PersonInfo> {
    private T personInfo;

	public Person(T personInfo) {
		super();
		this.setPersonInfo(personInfo);
	}

	public T getPersonInfo() {
		return personInfo;
	}

	public void setPersonInfo(T personInfo) {
		this.personInfo = personInfo;
	}

	@Override
	public String toString() {
		return this.personInfo.toString();
	}
	
    
}
