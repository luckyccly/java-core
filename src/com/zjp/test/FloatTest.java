package com.zjp.test;

import java.io.IOException;

public class FloatTest {
    public static void main(String[] args) throws IOException {
    	float a = 1.0f - 0.9f;
        float b = 0.9f - 0.8f;
        System.out.println(a+"==="+b);
        if (a == b) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
	}
}
