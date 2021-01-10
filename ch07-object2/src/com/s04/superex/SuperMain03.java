package com.s04.superex;

//부모클래스
class People{
	int a = 100;
	
	//생성자
	public People() {
		super();//Object의 default 생성자 호출
	}
}
//자식클래스
class Child2 extends People{
	int b = 200;
	
	//생성자
	public Child2() {
		super();//부모클래스의 default 생성자 호출
	}//컴파일러가 자동적으로 처리해줌 object->people->Child 이 순으로 생성자 호출
}

public class SuperMain03 {
	public static void main(String[] args) {
		Child2 ch = new Child2();
		System.out.println(ch.a);
		System.out.println(ch.b);
	}
}
