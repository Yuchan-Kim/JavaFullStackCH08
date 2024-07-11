package com.javaex.ex02;

import java.io.IOException;
import java.io.FileReader;

public class FileApp  {

	public static void main(String[] args){
		
		//없는 파일 읽어오기. 
		FileReader reader = null;
        try {
            // 존재하지 않는 파일을 읽으려 시도
            reader = new FileReader("nonexistentfile.txt");
            int character;
            if ((character = reader.read()) != -1) {
                System.out.print((char) character);
            }
        } catch (IOException e) {
            System.out.println("파일이 없습니다.");
     
        } 
		
		

	}

}
