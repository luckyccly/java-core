package com.zjp.Type;

public class Info<T extends Number> {
    private T var;
    public void setVar(T var) {
    	this.var = var;
    }
    public T getVar() {
    	return this.var;
    }
}
