package com.s01.file;

import java.io.File;

public class FileMain01 {
	public static void main(String[] args) {
		String path = "C:\\"; // \ : 디렉토리 구분자
		
		File f = new File(path);
			//C가 존재하는지	//디렉토리가 아닐때 진입
		if(!f.exists() || !f.isDirectory()) {
			System.out.println("유효하지 않은 디렉토리입니다.");
			//프로그램 종료
			System.exit(0);
		}
		
		//인자로 전달된 디렉토리의 하위 디렉토리 및 파일 정보를
		//File배열로 반환
		File[] files = f.listFiles();
		
		for(int i=0;i<files.length;i++) {
			File f2 = files[i];
			if(f2.isDirectory()) {//디렉토리
				System.out.println("[" + f2.getName() + "]");
			}else {//파일
				System.out.print(f2.getName());      //읽어온 파일에 대한 용량
				System.out.printf("(%,dbytes)\n", f2.length());//바이트로 용량 표시
			}
		}
		
	}
}




