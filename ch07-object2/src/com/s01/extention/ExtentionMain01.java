package com.s01.extention;

//부모 클래스
class parent{//extends object 생략
			//클래스를 정의하면 자동적으로 object가 상속됨
	int a = 500;
}
//자식 클래스
class Child extends parent{//자바에서는 상속관계를 벗어날수없다 parent가 소멸 -> Child 부모클래스는 object
	int b =200;
}

public class ExtentionMain01 {//
	public static void main(String[] args) {
		Child ch = new Child();
		//Child 클래스에 상속된 parent 클래스의 멤버변수 호출
		System.out.println(ch.a);
		//Child 클래스의 멤버변수 호출
		System.out.println(ch.b);
	}
}
