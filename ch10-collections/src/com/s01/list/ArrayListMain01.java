package com.s01.list;

import java.util.ArrayList;

class A{
	@Override
	public String toString() {
		return "A";
	}
}
//제네릭 표현을 사용하면 객체가 지정되는데 제네릭표현을 사용하지않을시 
//object로 반환된다.

class B{}

public class ArrayListMain01 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(new A());//A -> Object
		al.add(new B());//B -> Object
		al.add("홍길동");//String -> Object
		al.add(100);//Integer -> Object
		
		//ArrayList에 저장된 요소의 목록
		System.out.println(al);
	}

}



