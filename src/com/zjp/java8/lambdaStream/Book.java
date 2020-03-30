package com.zjp.java8.lambdaStream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@AllArgsConstructor
@Data
@NoArgsConstructor
@Setter
@Accessors(chain = true)
public class Book {
	private int id;
	private String bookName;
	private double price;
	
	public static void main(String[] args) {
		Book book = new Book();
	}
}
