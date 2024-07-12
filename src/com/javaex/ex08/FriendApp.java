package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {
		
		Friend[] pplArr = new Friend[3];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해 주세요.");
		
		for (int i = 0; i < pplArr.length; i++) {
			String info = sc.nextLine();
			String[] infoArr = info.split(" ");
			
			pplArr[i] = new Friend(infoArr[0],infoArr[1],infoArr[2]);
			
			
		}
		
		for(int i = 0; i< pplArr.length; i++) {
			System.out.println("이름: "+ pplArr[i].getName() + "핸드폰: " + pplArr[i].getHp()+ "학교: " + pplArr[i].getSchool());
		}
		
		
	}

}
