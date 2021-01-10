package com.s05.poly;

//부모클래스
class Parent{
	int a = 100;
}
//자식클래스
class Child extends Parent{
	int b = 200;
}

public class PolyMain01 {
	public static void main(String[] args) {
		//참조자료형
		Child ch = new Child();//모든 영역에 있어서 접근이 가능함.(참조)
		System.out.println(ch.a);
		System.out.println(ch.b);
		//참조자료형이 형변환 될 경우에는 부모와 자식클래스 사이에서만 가능하다.
		
		Parent p = ch;//parent일 경우 영역이 줄어듬. parent영역만 참조함. 
					  //자식클래스 타입 -> 부모클래스타입 형변환 업캐스팅, 자동적으로 형변환	
		System.out.println(p.a);
		//호출 범위를 벗어나 호출 불가
		//System.out.println(p.b);
		
		Child ch2 = (Child)p;//부모클래스 타입 -> 자식클래스타입으로 형변환
							//다운캐스팅, 명시적으로 형변환	
		System.out.println(ch2.a);
		System.out.println(ch2.b);
		
	}
}
