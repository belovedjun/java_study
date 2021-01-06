package com.s05.constructor;
//같은 패키지 같은 클래스안에 return한 값들을 반환하고 읽어와서 출력
public class MyClass {
	//은닉화
	private String  name;
	private int age;
	
	//인자가 없는 생성자 
		public MyClass() {}	
	
	//인자가 있는 생성자
	public MyClass(String n, int a) {//인자의 개수와 타입이 다르기 때문에 에러x
		name = n;
		age = a;
		
	}
	
	public MyClass(String n) {
		name = n;
		age = 10;
	}
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	public void setAge(int a) {
		age =a;
	}
	public int getAge() {
		return age;
	}
}
