package com.s06.statictest;

public class StaticCount {
	//인스턴스 변수(객체가 생성될때 객체에 포함)
	int c;
	//static(클래스) 변수(객체에 포함되지 않음)
	static int count;
	
	//생성자
	public StaticCount() {
		c++;
		count++;
	}
}
