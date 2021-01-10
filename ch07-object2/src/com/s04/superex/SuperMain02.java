package com.s04.superex;
	
//부모클래스
class Parent{
	int a = 100;
	public void play() {
		System.out.println("Parent의 play 메서드");
	}
}
//자식클래스
class Child extends Parent{
	int a = 200;
	
	public Child() {
		System.out.println(super.a);//100
		super.play();//Parent클래스의 play메서드 호출
		System.out.println("-----------------");
	}
	
	//메서드 재정의
	@Override
	public void play() {
		System.out.println("Child의 paly 메서드");
	}
}


public class SuperMain02 {
	public static void main(String[] args) {
		Child ch = new Child();
		System.out.println(ch.a);
		ch.play();
	}
}
