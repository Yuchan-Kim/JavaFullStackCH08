package com.javaex.ex05;

public class Div {
	public static int Division(int x, int y) {
		if (y == 0) {
			throw new ArithmeticException("Cannot divide by zero");
		}else {
			return x/y;
		}
		

	}
}
