package com.s03.ouput;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamMain {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			//덮어쓰기
			fos = new FileOutputStream("fileOut.txt");
			
			//이어쓰기                       파일명,이어쓰기 여부(true->이어쓰기)
			fos = new FileOutputStream("fileOut.txt", true);
					
			String message =
					"Hello File! 파일에 내용을 명시하다!!";
			         //String -> byte[]
			fos.write(message.getBytes());
			
			System.out.println(
					"파일을 생성하고 내용을 명시함");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			//자원정리
			if(fos!=null)try {fos.close();}catch(IOException e) {}
		}
	}
}
