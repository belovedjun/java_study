package com.s01.file;

import java.io.File;

public class FileMain03 {
	public static void main(String[] args) {
		//절대경로
		String path = "C:\\javaWork\\javaSample\\";
		
		File f1 = new File(path);
		//파일과 디렉토리를 만들수있다.
		System.out.println("===디렉토리 생성===");
		System.out.println(f1.mkdir());
	}
}
