package com.javaex.ex01;

public class LastNumberApp {

	public static void main(String[] args) {
		
		int[] tester = {1,2,3,4};
		
		try {
			for(int i = 0; i <= tester.length; i++) {
				tester[i] += 1;
			}
			
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 넘었습니다.");
		}
	}

}
