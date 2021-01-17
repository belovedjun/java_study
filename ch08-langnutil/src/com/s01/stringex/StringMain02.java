package com.s01.stringex;

public class StringMain02 {
	public static void main(String[] args) {
		String s1 = "Kwon Sun Ae";
					//012345678910 , 문자열의 길이 = 11
		
		int index = s1.indexOf('n');//맨 앞에 있는 문자를 찾아준다
		System.out.println(
				"맨 처음 문자 n의 위치 : " + index);
		
		index = s1.indexOf("Sun"); //메서드 오버로딩
		System.out.println(
				"문자열 Sun의 위치 : " + index);
		
		index = s1.lastIndexOf('n');//중복된 문자를 탐색
		System.out.println(
				"마지막 문자 n의 위치 : " + index);
		
		char c = s1.charAt(index);//문자 추출
		System.out.println("추출한 문자 : " + c);
		
		index = s1.indexOf('S');
		//지정한 인덱스부터 마지막 인덱스까지 문자열 추출
		String str = s1.substring(index);
		System.out.println(
				"대문자 S부터 끝까지 잘라내기 : " + str);
		
		//시작 인덱스부터 끝 인덱스전까지 문자열 추출(끝인덱스 포함x)
		str = s1.substring(index, index+3); //5,8
		System.out.println("대문자 S로부터 3자까지 잘라내기 : " + str);
		
		int length = s1.length();
		System.out.println("s1의 길이 : " + length);
		
		String[] array = s1.split(" ");
		for(int i=0;i<array.length;i++) {
			System.out.println("array["+i+"]:"+array[i]);
		}
		
	}
}
