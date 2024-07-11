package com.javaex.ex04;

import java.util.Scanner;

public class StringtoNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요.");
		String str = sc.nextLine();
		int sum = 0;
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			sum += Integer.parseInt(strArr[i]);
		}
		
		System.out.println(sum);
	}

}
