package com.s01.stringex;

public class StringMain04 {
	public static void main(String[] args) {
		/*
		 * [실습]
		 * 문자열에서 소문자는 대문자, 대문자는 소문자로 변경하시오.
		 * 아스키코드 : 65~90 대문자 
		 * 			97~122 소문자
		 * 문자열의 길이 : length()
		 * 문자열에서 문자 : charAt(index)
		 * 소문자 -> 대문자 : toUpperCase()
		 * 대문자 -> 소문자 : toLowerCase()
		 * 문자 -> 문자열 : String.valuof(문자)
		 */
		String str = "abcMDye-4W?EWzz";
						//문자열의 길이
		String result = "";
		for(int i=0;i<str.length();i++) {
			//인덱스 전달하고 문자를 추출
			char c = str.charAt(i);//문자 추출
			
			//문자가 소문자 범위인지 대문자 범위인지 체크
			if(c>=65 && c<=90) {//대문자 -> 소문자
							//문자->문자열
				result += String.valueOf(c).toLowerCase();
			}else if(c>=97 && c<=122) {//소문자 -> 대문자
				result += String.valueOf(c).toUpperCase();
			}else {//대문자도 소문자도 아닌 경우
				result += c;
			}
		}
		//결과값 출력
		System.out.println(result);
		
		System.out.println("---------------------");
		
		String result2 = "";
		//아스키코드방식
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);//문자 추출
			if(c>=65 && c<=90) {//대문자 -> 소문자
				result2 += (char)(c + 32);
			}else if(c>=97 && c<=122) {//소문자 -> 대문자
				result2 += (char)(c - 32);
			}else {//대문자도 소문자도 아닌 경우
				result2 += c;
			}
		}
		System.out.println(result2);
		
		System.out.println("--------------------");
		
		String result3 = "";
		for(int i=0;i<str.length();i++) {
			char c = str.charAt(i);
			if(Character.isUpperCase(c)) {//대문자
						//대문자 -> 소문자
				result += Character.toLowerCase(c);
			}else if(Character.isLowerCase(c)) {//소문자
						//소문자 -> 대문자
				result += Character.toUpperCase(c);
			}else {//대문자도 소문자도 아닌 경우
				
			}
		}
		System.out.println(result3);
	}
}




