package com.s04.superex;

//부모클래스
class Parent2{
	int a;
	int b;
	//인자가 있는 생성자
	public Parent2(int a, int b) {
		this.a = a;
		this.b = b;
	}
}
//자식클래스
class Child3 extends Parent2{
	public Child3(int a, int b) {
		super(a,b);
	}
}

public class SuperMain05 {
	public static void main(String[] args) {
		Child3 ch = new Child3(60,30);
		System.out.println(ch.a);
		System.out.println(ch.b);
	}
}
