package com.s02.overloading;

public class OverloadingMain02 {
	
	//Method Overloading(중복정의)
	public void getLength(int a) {
		String s = String.valueOf(a);//int -> String(문자열에서 문자 단위로 카운팅된다.)
		getLength(s);    //valueof(a)가 String 으로 변환시켜줌
	}
	
	public void getLength(float a) {
		String s = String.valueOf(a);//float -> String
		getLength(s);//메서드내에서 메서드 호출 가능
	}
	//같은 패키지 내에서 호출
	int getLength(String str) {
		System.out.println(str.length());		
		return str.length();
	}
	
	public static void main(String[] args) {
		OverloadingMain02 om = new OverloadingMain02();
		om.getLength(10000);//10000 -> "10000", 5
		om.getLength(3.14f);//3.14f -> "3.14", 4
		om.getLength("bus");//"bus" -> 3
	}
}
