package com.s05.constructor;

class Car {//클래스는 하나이지만 여러객체 생성가능
	String color; //색상 (null로 초기화(객체 주소가 초기화가 되지않은 상태))
	String gearType; //변속기 종류 - auto(자동),manual(수동)
	int door;//문의 갯수
	
	//기본 생성자, 생략 가능
	public Car() {}
}//()어떤값을 넣어서 실행가능, {}수행문 작업실행

public class CarMain {
	public static void main(String[] args) {
		//객체 선언 및 생성
		Car c1 = new Car(); //생성자는 멤버변수 초기화
		//생성자가 초기화한 멤버변수의 값 출력
		System.out.println(c1.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);

		System.out.println("--------------");
		
		c1.color = "White";
		c1.gearType = "auto";
		c1.door = 4;
		System.out.println(c1.color);
		System.out.println(c1.gearType);
		System.out.println(c1.door);
		
		//객체의 참조값(같은 값인지 @뒤에 해시값으로 식별)
		System.out.println(c1);
		System.out.println("--------------");
		
		Car c2 = new Car();
		c2.color = "Black";
		c2.gearType = "manual";
		c2.door = 5;
		
		System.out.println(c2.color);
		System.out.println(c2.gearType);
		System.out.println(c2.door);
		
		System.out.println(c2);
		
   }
}
