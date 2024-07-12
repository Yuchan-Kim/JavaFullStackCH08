package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		System.out.print(">> ");
		String input = sc.nextLine();
		
		if(input.equals("/q")) {
			System.out.println("프로그램을 종료합니다.");
		}else{
			while (!input.equals("/q")) {
				
				String[] inputArr; 
				if (input.contains(" ")) {
					inputArr = input.split(" ");
				}else {
					inputArr = input.split("");
				}
				
				
				if (inputArr[1].equals("+")) {
					System.out.println(">> " +Add.addition(Integer.parseInt(inputArr[0]),Integer.parseInt(inputArr[2])));
				}else if(inputArr[1].equals("-")) {
					System.out.println(">> " +Sub.subtraction(Integer.parseInt(inputArr[0]),Integer.parseInt(inputArr[2])));
				}else if(inputArr[1].equals("*")) {
					System.out.println(">> " +Mul.Multiplication(Integer.parseInt(inputArr[0]),Integer.parseInt(inputArr[2])));
				}else if(inputArr[1].equals("/")) {
					System.out.println(">> " +Div.Division(Integer.parseInt(inputArr[0]),Integer.parseInt(inputArr[2])));
				}else {
					System.out.println("알 수 없는 연산자입니다.");
				}
				System.out.print(">> ");
				input = sc.nextLine();
				if(input.equals("/q")) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
				
			}
		}
		sc.close();
	}
}
